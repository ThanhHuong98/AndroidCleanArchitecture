package com.example.baseproject

import android.app.Application
import com.example.baseproject.di.AppComponent
import com.example.baseproject.di.DaggerAppComponent

open class MyApplication: Application(){
    val appComponent: AppComponent by lazy {
        DaggerAppComponent.create()
    }
}