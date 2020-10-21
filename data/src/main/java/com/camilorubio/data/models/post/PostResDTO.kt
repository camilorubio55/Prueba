package com.camilorubio.data.models.post

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PostResDTO (
    @Json(name = "userId") val userId : Int,
    @Json(name = "id") val id : Int,
    @Json(name = "title") val title : String,
    @Json(name = "body") val body : String
)
