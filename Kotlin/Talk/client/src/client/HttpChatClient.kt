package client

import HttpApi
import Message
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import retrofit2.Retrofit
import retrofit2.converter.jackson.JacksonConverterFactory
import retrofit2.create

class HttpChatClient(host: String, port: Int) {
    private val objectMapper = jacksonObjectMapper()
    private val httpApi: HttpApi = Retrofit.Builder().baseUrl("http://$host:$port")
        .addConverterFactory(JacksonConverterFactory.create(objectMapper)).build().create()

    fun sendMessage(message: Message) {
        val response = httpApi.sendMessage(message).execute()
        if (!response.isSuccessful) {
            println("${response.code()} ${response.message()}}")
        }
    }
}