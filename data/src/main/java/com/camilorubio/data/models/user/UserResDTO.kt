package com.camilorubio.data.models.user

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class UserResDTO (
    @Json(name = "id") val id : Int,
    @Json(name = "name") val name : String,
    @Json(name = "username") val username : String,
    @Json(name = "email") val email : String,
    @Json(name = "address") val address : AddressResDTO?,
    @Json(name = "phone") val phone : String,
    @Json(name = "website") val website : String,
    @Json(name = "company") val company : CompanyResDTO?
)