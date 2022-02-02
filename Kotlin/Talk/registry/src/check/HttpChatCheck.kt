package check

import UserInfo
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import retrofit2.Retrofit
import retrofit2.converter.jackson.JacksonConverterFactory

class HttpChatCheck(private val user: UserInfo) {
    private val objectMapper = jacksonObjectMapper()
    private val httpApi = Retrofit.Builder()
        .baseUrl("http://${user.address.host}:${user.address.port}")
        .addConverterFactory(JacksonConverterFactory.create(objectMapper))
        .build().create(CheckApi::class.java)

    fun check() {
        try {
            println("${user.name} checking started")
            val response = httpApi.check().execute()
            if (response.isSuccessful) {
                println("${user.name} checked")
            } else {
                Registry.users.remove(user.name)
            }
            println("${user.name} check failed")
        } catch (e: Exception) {
            Registry.users.remove(user.name)
            println("${user.name} check failed")
        }
    }
}