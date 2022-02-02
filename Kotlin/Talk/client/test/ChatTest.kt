import client.HttpChatClient
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import server.ChatMessageListener
import server.HttpChatServer
import kotlin.concurrent.thread
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class ChatTestListener : ChatMessageListener {
    val chatHistory: MutableList<Pair<String, String>> = mutableListOf()

    override fun messageReceived(userName: String, text: String) {
        chatHistory.add(Pair(userName, text))
    }
}

class ChatTest {
    private val listener = ChatTestListener()
    private val testUserName = "pupkin"
    private val testHttpAddress = UserAddress("127.0.0.1", 9999)

    @BeforeEach
    fun clearHistory() {
        listener.chatHistory.clear()
    }

    @Test
    fun `test http message receiving`() {
        val testMessages = listOf(
            "однажды,",
            "возможно,",
            "я начну делать домашки",
            "вовремя.",
            "но, если честно,",
            "я не уверена`_~*"
        )

        val server = HttpChatServer(testHttpAddress.host, testHttpAddress.port)
        val client = HttpChatClient(testHttpAddress.host, testHttpAddress.port)

        server.setMessageListener(listener)

        val serversJob = thread {
            server.start()
        }

        runBlocking {
            delay(100)
            testMessages.forEach {
                client.sendMessage(Message(testUserName, it))
            }
            delay(100)
        }

        server.stop()
        serversJob.join()

        assertEquals(testMessages, listener.chatHistory.map { it.second })
        assertTrue(listener.chatHistory.all { it.first == testUserName })
    }
}