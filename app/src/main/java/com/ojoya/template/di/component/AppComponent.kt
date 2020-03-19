package com.ojoya.template.di.component

import android.app.Application
import com.ojoya.template.di.modules.ActivityBuilderModule
import com.ojoya.template.App
import com.ojoya.template.di.modules.ApiModule
import com.ojoya.template.di.modules.AppModule
import com.ojoya.template.di.modules.ViewModelModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component( modules = [AndroidInjectionModule::class, AppModule::class, ActivityBuilderModule::class,
    ViewModelModule::class, ApiModule::class])
interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder
        fun build(): AppComponent
    }

    fun inject(app: App)
}