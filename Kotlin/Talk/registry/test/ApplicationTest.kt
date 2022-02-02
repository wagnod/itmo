import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import io.ktor.application.*
import io.ktor.config.*
import io.ktor.http.*
import io.ktor.server.testing.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import java.util.concurrent.ConcurrentHashMap
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlin.test.fail

fun Application.testModule() {
    (environment.config as MapApplicationConfig).apply {
        // define test environment here
    }
    module(testing = true)
}

class ApplicationTest {
    private val objectMapper = jacksonObjectMapper()
    private val testUserName = "pupkin"
    private val testHttpAddress = UserAddress("127.0.0.1", 9999)
    private val userData = UserInfo(testUserName, testHttpAddress)


    @BeforeEach
    fun clearRegistry() {
        Registry.users.clear()
    }

    @Test
    fun `health endpoint`() {
        withTestApplication({ testModule() }) {
            handleRequest(HttpMethod.Get, "/v1/health").apply {
                assertEquals(HttpStatusCode.OK, response.status())
                assertEquals("OK", response.content)
            }
        }
    }

    @Test
    fun `register user duplicate`() = withRegisteredTestUser {
        handleRequest(HttpMethod.Post, "/v1/users") {
            addHeader("Content-type", "application/json")
            setBody(objectMapper.writeValueAsString(userData))
        }.apply {
            assertEquals(HttpStatusCode.Conflict, response.status())
        }
    }

    @Test
    fun `register user`() = withRegisteredTestUser {
        val newUser = UserInfo("Ivan", UserAddress("127.0.0.1", 1234))
        handleRequest(HttpMethod.Post, "/v1/users") {
            addHeader("Content-type", "application/json")
            setBody(objectMapper.writeValueAsString(newUser))
        }.apply {
            assertEquals(HttpStatusCode.OK, response.status())
            assertEquals(mapOf("status" to "ok"), objectMapper.readValue(response.content ?: ""))
        }
    }

    @Test
    fun `register bad user name`() = withRegisteredTestUser {
        handleRequest(HttpMethod.Post, "/v1/users") {
            val userDataBad = UserInfo("~123anflj*", testHttpAddress)

            addHeader("Content-type", "application/json")
            setBody(objectMapper.writeValueAsString(userDataBad))
        }.apply {
            assertEquals(HttpStatusCode.BadRequest, response.status())
        }
    }

    @Test
    fun `update user info`() = withRegisteredTestUser {
        handleRequest(HttpMethod.Put, "/v1/users/$testUserName") {
            addHeader("Content-Type", "application/json")
            setBody(objectMapper.writeValueAsString(UserAddress("127.0.0.1", 1234)))
        }.apply {
            assertEquals(HttpStatusCode.OK, response.status())
            assertEquals(mapOf("status" to "ok"), objectMapper.readValue(response.content ?: ""))
        }
    }

    @Test
    fun `update bad user info`() = withRegisteredTestUser {
        val userName = "12~mlknk.*"
        handleRequest(HttpMethod.Put, "/v1/users/$userName") {
            addHeader("Content-Type", "application/json")
            setBody(objectMapper.writeValueAsString(UserAddress("127.0.0.1", 1234)))
        }.apply {
            assertEquals(HttpStatusCode.BadRequest, response.status())
        }
    }

    @Test
    fun `list users`() = withRegisteredTestUser {
        handleRequest(HttpMethod.Get, "/v1/users").apply {
            assertEquals(HttpStatusCode.OK, response.status())
            val content = response.content
            assertNotNull(content)
            val users: ConcurrentHashMap<String, UserAddress> = objectMapper.readValue(content)
            assertEquals(1, users.size)
            assertNotNull(users[testUserName])
            assertEquals(testHttpAddress, users[testUserName])
        }
    }

    @Test
    fun `delete user`() = withRegisteredTestUser {
        handleRequest(HttpMethod.Delete, "/v1/users/$testUserName").apply {
            assertEquals(HttpStatusCode.OK, response.status())
            val content = response.content
            assertNotNull(content)
            val info: HashMap<String, String> = objectMapper.readValue(content)
            assertNotNull(info["status"])
            assertEquals("ok", info["status"])
        }
    }

    private fun withRegisteredTestUser(block: TestApplicationEngine.() -> Unit) {
        withTestApplication({ testModule() }) {
            handleRequest {
                method = HttpMethod.Post
                uri = "/v1/users"
                addHeader("Content-type", "application/json")
                setBody(objectMapper.writeValueAsString(userData))
            }.apply {
                assertEquals(HttpStatusCode.OK, response.status())
                val content = response.content ?: fail("No response content")
                val info = objectMapper.readValue<HashMap<String, String>>(content)

                assertNotNull(info["status"])
                assertEquals("ok", info["status"])

                this@withTestApplication.block()
            }
        }
    }
}