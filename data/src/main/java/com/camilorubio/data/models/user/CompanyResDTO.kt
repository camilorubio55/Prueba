package com.camilorubio.data.models.user

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
class CompanyResDTO (
    @Json(name = "name") val name : String,
    @Json(name = "catchPhrase") val catchPhrase : String,
    @Json(name = "bs") val bs : String
)