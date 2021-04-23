package com.common.login.api

import com.common.core.base.net.BaseResponse
import com.common.login.entity.LoginEntity
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface LoginService {

    @FormUrlEncoded
    @POST("user/login")
    suspend fun userLogin(
            @Field("username") username: String?,
            @Field("password") password: String?
    ): BaseResponse<LoginEntity?>
}