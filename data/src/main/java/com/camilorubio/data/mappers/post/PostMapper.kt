package com.camilorubio.data.mappers.post

import com.camilorubio.data.models.post.PostResDTO
import com.camilorubio.domain.models.post.PostBind

class PostMapper {

    fun toPostBind(postResDTO: PostResDTO) : PostBind {
        return PostBind(
            id = postResDTO.id,
            title = postResDTO.title,
            body = postResDTO.body
        )
    }

}