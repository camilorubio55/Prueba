package com.camilorubio.data.models.user

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
class GeoResDTO (
    @Json(name = "lat") val lat : String,
    @Json(name = "lng") val lng : String
)