package com.example.baseproject.di
import com.example.baseproject.data.api.ABCNetworkModule
import com.example.baseproject.data.api.services.ABCNetworkService
import com.example.baseproject.presentation.home.MainActivity
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector
import javax.inject.Singleton

@Module
object NetworkModule {
    @Provides
    @Singleton
    fun provideABCNetworkService(module: ABCNetworkModule) : ABCNetworkService {
        return module.getNetworkService()
    }

}