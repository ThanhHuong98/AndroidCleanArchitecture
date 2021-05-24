package com.example.baseproject.data.api.base

import com.example.baseproject.utils.extension.SkipNetworkInterceptor
import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

abstract class SharedNetworkModule {
    fun getRetrofit() : Retrofit {
        return Retrofit.Builder()
            .baseUrl(getBaseUrl())
            .client(getOkHttpClient())
            .addConverterFactory(requireGSON())
            .build()
    }

    inline fun <reified S> getService(): S = getRetrofit().create(S::class.java)

    open fun getOkHttpClient(): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(SkipNetworkInterceptor())
            .build()
    }

    open fun requireGSON(): GsonConverterFactory = GsonConverterFactory.create(GsonBuilder().create())

    abstract fun getBaseUrl(): String

}