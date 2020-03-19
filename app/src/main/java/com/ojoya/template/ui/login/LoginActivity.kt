package com.ojoya.template.ui.login

import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.ojoya.template.R
import com.ojoya.template.ui.base.BaseActivity
import com.ojoya.template.viewmodels.LoginViewModel
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_login.*
import javax.inject.Inject

class LoginActivity : BaseActivity() {

    @Inject
    lateinit var loginViewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar?.title = "Login"

        loginViewModel = ViewModelProvider(this, viewModelFactory).get(LoginViewModel::class.java)

        loginButton.setOnClickListener {
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()
            loginViewModel.login(email, password)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe ({
                    Toast.makeText(this, "Success", Toast.LENGTH_SHORT).show()
                }, {
                    it.printStackTrace()
                })
        }
    }
}