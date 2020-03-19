package com.ojoya.template.viewmodels

import androidx.lifecycle.ViewModel
import com.ojoya.template.data.api.responses.LoginResponse
import com.ojoya.template.data.repositories.LoginRepository
import io.reactivex.Completable
import io.reactivex.Single
import javax.inject.Inject

class LoginViewModel @Inject constructor(private val loginRepository: LoginRepository) : ViewModel() {

    fun login(email: String, password: String): Single<LoginResponse> {
        return loginRepository.login(email, password)
    }
}