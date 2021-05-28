package com.example.baseproject.di
import com.example.baseproject.data.api.NetworkModule
import com.example.baseproject.data.api.services.CharacterNetworkService
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
object NetworkModule {
    @Provides
    @Singleton
    fun provideABCNetworkService(module: NetworkModule) : CharacterNetworkService {
        return module.getNetworkService()
    }

}