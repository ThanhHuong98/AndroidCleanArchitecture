package com.example.baseproject
import com.example.baseproject.core.BaseApplication
import com.example.baseproject.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.HasAndroidInjector
import dagger.android.support.DaggerApplication

class MyApplication: BaseApplication(), HasAndroidInjector {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent
            .builder()
            .application(this)
            .build()
    }
}