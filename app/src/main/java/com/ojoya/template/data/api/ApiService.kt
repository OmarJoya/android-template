package com.ojoya.template.data.api

import com.ojoya.template.data.api.requests.LoginRequest
import com.ojoya.template.data.api.responses.LoginResponse
import io.reactivex.Single
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {
    @POST("login")
    fun login(@Body loginRequest: LoginRequest): Single<LoginResponse>
}