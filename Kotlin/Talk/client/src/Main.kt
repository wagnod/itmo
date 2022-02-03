import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import io.ktor.http.*
import kotlinx.cli.ArgParser
import kotlinx.cli.ArgType
import kotlinx.cli.default
import kotlinx.cli.required
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import retrofit2.Retrofit
import retrofit2.converter.jackson.JacksonConverterFactory
import server.HttpChatServer
import java.net.URL
import kotlin.concurrent.thread

val log: Logger = LoggerFactory.getLogger("main")

fun main(args: Array<String>) {
    val parser = ArgParser("client")
    val name by parser.option(ArgType.String, description = "Name of user").required()
    val registryBaseUrl by parser.option(ArgType.String, "registry", description = "Base URL of User Registry")
        .default("http://localhost:8088")

    val host by parser.option(ArgType.String, description = "Hostname or IP to listen on")
        .default("0.0.0.0") // 0.0.0.0 - listen on all network interfaces

    val port by parser.option(ArgType.Int, description = "Port to listen for on").default(8080)

    val publicUrl by parser.option(ArgType.String, "public-url", description = "Public URL")

    try {
        parser.parse(args)

        // validate host and port
        val hostAcc =
            """^(([a-zA-Z]|[a-zA-Z][a-zA-Z0-9-]*[a-zA-Z0-9])\.)*([A-Za-z]|[A-Za-z][A-Za-z0-9-]*[A-Za-z0-9])$"""
                .toRegex().find(host)
        val validateHost = hostIsIp(host) || hostAcc != null

        if (validateHost) throw IllegalArgumentException("Illegal hostname or IP '$host'")
        if (port !in 0..65535) throw IllegalArgumentException("Illegal port '$port'")


        checkUserName(name) ?: throw IllegalArgumentException("Illegal user name '$name'")

        // initialize registry interface
        val objectMapper = jacksonObjectMapper()
        val registry = Retrofit.Builder()
            .baseUrl(registryBaseUrl)
            .addConverterFactory(JacksonConverterFactory.create(objectMapper))
            .build().create(RegistryApi::class.java)

        // create server engine
        val server = HttpChatServer(host, port)
        val chat = Chat(name, registry)
        server.setMessageListener(chat)

        // start server as separate job
        val serverJob = thread {
            server.start()
        }
        try {
            // register our client
            val userAddress = when {
                publicUrl != null -> {
                    val url = URL(publicUrl)
                    UserAddress(url.host, url.port)
                }
                else -> UserAddress(host, port)
            }
            registry.register(UserInfo(name, userAddress)).execute()

            // start
            chat.commandLoop()
        } finally {
            registry.unregister(name).execute()
            server.stop()
            serverJob.join()
        }
    } catch (e: Exception) {
        log.error("Error! ${e.message}", e)
        println("Error! ${e.message}")
    }
}