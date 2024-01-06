package jsonFetch.models

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RdsService {
//    private val BASE_URL = "https://run.mocky.io/"
    private val BASE_URL = "https://exam.ankush.wiki/"

    val api = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(RdsApi::class.java)
}