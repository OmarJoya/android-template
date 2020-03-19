package com.ojoya.template.ui.login

import android.os.Bundle
import com.ojoya.template.R
import com.ojoya.template.ui.BaseActivity

class LoginActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar?.title = "Login"
    }
}