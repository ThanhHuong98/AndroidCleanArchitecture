package com.example.baseproject.di

import com.example.baseproject.presentation.home.MainActivity
import dagger.Component
import javax.inject.Singleton


@Singleton
@ApplicationScope
@Component(modules = [RepositoryModule::class, NetworkModule::class])
interface AppComponent {
    fun inject(activity: MainActivity)
}