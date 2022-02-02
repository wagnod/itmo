package check

import retrofit2.Call
import retrofit2.http.GET

interface CheckApi {
    @GET("/v1/health")
    fun check(): Call<Map<String, String>>
}