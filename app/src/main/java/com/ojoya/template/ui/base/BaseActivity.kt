package com.ojoya.template.ui.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ojoya.template.di.ViewModelFactory
import dagger.android.AndroidInjection
import javax.inject.Inject

abstract class BaseActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
    }
}