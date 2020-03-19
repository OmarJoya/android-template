package com.ojoya.template.data.repositories

import com.ojoya.template.data.api.ApiService
import com.ojoya.template.data.api.requests.LoginRequest
import com.ojoya.template.data.api.responses.LoginResponse
import io.reactivex.Completable
import io.reactivex.Single
import javax.inject.Inject

class LoginRepository @Inject constructor(private val apiService: ApiService) {

    fun login(email: String, password: String): Single<LoginResponse> {
        val loginRequest = LoginRequest(email, password)
        return apiService.login(loginRequest)
    }
}