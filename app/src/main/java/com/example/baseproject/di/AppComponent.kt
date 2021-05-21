package com.example.baseproject.di

import android.app.Application
import com.example.baseproject.MyApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton


@Singleton
@ApplicationScope
@Component(modules = [
    RepositoryModule::class,
    NetworkModule::class,
    AndroidSupportInjectionModule::class])
interface AppComponent : AndroidInjector<MyApplication> {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }
}