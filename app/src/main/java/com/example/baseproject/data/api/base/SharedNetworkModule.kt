package com.example.baseproject.data.api.base

import com.google.gson.GsonBuilder
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

abstract class SharedNetworkModule {
    fun getRetrofit() : Retrofit {
        return Retrofit.Builder()
            .baseUrl(getBaseUrl())
            .client(getOkHttpClient())
            .addConverterFactory(requireGSON())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()
    }

    inline fun <reified S> getService(): S = getRetrofit().create(S::class.java)

    open fun getOkHttpClient(): OkHttpClient {
        return OkHttpClient.Builder().build()
    }

    open fun requireGSON(): GsonConverterFactory = GsonConverterFactory.create(GsonBuilder().create())

    abstract fun getBaseUrl(): String

}