package jsonFetch.viewmodel

import jsonFetch.models.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.*
import java.util.regex.Pattern

class RdsViewModel {
    var count : Int = 0
    fun getDataList() {
        RdsService.api.getResponse()
            .enqueue(object : Callback<RdsResponse<DataList>> {
                override fun onResponse(
                    call: Call<RdsResponse<DataList>>,
                    response: Response<RdsResponse<DataList>>
                ) {
                    if (response.isSuccessful) {
                        val data = response.body()
                        data?.let {
                            println("status code: ${response.code()}")
                            for (item in data.data!!) {
                                val nameVal = item.name?.lowercase(Locale.getDefault())
                                if (nameVal?.contains("version") == true) {
                                    val noOfSubStr = countMatches(mainStr = nameVal, pattern = "version")
                                    count += noOfSubStr
                                }
                            }
                            println("total count: $count")
                        }
                    }
                }

                override fun onFailure(call: Call<RdsResponse<DataList>>, t: Throwable) {
                    println(t.localizedMessage)
                }

            })
    }

    fun sendPostRequest(count: Int) {
        val rdsBodyRequest = RdsBodyRequest(count=count)
        RdsService.api.postResponse(rdsBodyRequest).enqueue(object : Callback<RdsBodyResponse> {
            override fun onResponse(call: Call<RdsBodyResponse>, response: Response<RdsBodyResponse>) {
                val data = response.body()
                println(data)
            }

            override fun onFailure(call: Call<RdsBodyResponse>, t: Throwable) {
                println(t.localizedMessage)
            }

        })
    }
    fun countMatches(mainStr: String, pattern: String): Int {
        val matcher = Pattern.compile(pattern).matcher(mainStr)

        var count = 0
        while (matcher.find()) {
            count++
        }
        return count
    }
}