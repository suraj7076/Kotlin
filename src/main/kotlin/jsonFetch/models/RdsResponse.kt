package jsonFetch.models

import com.google.gson.annotations.SerializedName

data class RdsResponse<DataList>(
    val message: String?,
    val data: List<DataList>?
)

data class DataList(
    val id: String?,
    val identifiers: List<Any>?,
    val links: List<Any>?,
    val name: String?,
    @SerializedName("other_names") val otherNames: List<Any>?,
    @SerializedName("superseded_by") val supersededBy: String?,
    val keywords: List<String>?,
    val text: List<Any>?
)