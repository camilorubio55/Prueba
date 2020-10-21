package com.camilorubio.domain.models.user

data class UserBind (
    var id: Int = 0,
    var name: String = String(),
    var email: String = String(),
    var phone: String = String()
)