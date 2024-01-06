package jsonFetch.models

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST

interface RdsApi {
//    @GET("/v3/4d940ddd-b8ca-4b16-be62-67f1afc6e1e7")
    @Headers(
        "Cookie: connect.sid=s%3AilyV12qCBNET_8UuaQ-DjfEqQr3OIVq7.dyGrZMzwGPdoYCZXc6c%2FEF13gnUfg79tTEGmh3aXxf8"
    )
    @GET("/challenges")
    fun getResponse(): Call<RdsResponse<DataList>>

    @Headers(
        "Cookie: connect.sid=s%3AilyV12qCBNET_8UuaQ-DjfEqQr3OIVq7.dyGrZMzwGPdoYCZXc6c%2FEF13gnUfg79tTEGmh3aXxf8"
    )
    @POST("/challenges")
    fun postResponse(@Body response: RdsBodyRequest): Call<RdsBodyResponse>
}