package com.ojoya.template.di.modules

import com.ojoya.template.ui.login.LoginActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilderModule {
    @ContributesAndroidInjector
    abstract fun contributeLoginActivity(): LoginActivity
}