package com.camilorubio.data.mappers.user

import com.camilorubio.data.models.user.UserResDTO
import com.camilorubio.domain.models.user.UserBind

class UserMapper {

    fun toUserBind(userResDTO: UserResDTO) : UserBind {
        return UserBind(
            id = userResDTO.id,
            name = userResDTO.name,
            email = userResDTO.email,
            phone = userResDTO.phone
        )
    }

}