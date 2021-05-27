package com.example.baseproject.data.api.base

import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


/**
 * .addCallAdapterFactory(RxJava2CallAdapterFactory.create()) if you use RxJava2
 * . if you use Coroutine -> config following
 * */
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
        /**
         * Using SkipNetworkInterceptor() for testing: You want config api by yourself
         *  return OkHttpClient.Builder()
            .addInterceptor(SkipNetworkInterceptor())
            .build()
         * otherwise, config any thing you want here about OkHttp-Client
         * */
        return OkHttpClient.Builder()
            .build()
    }

    open fun requireGSON(): GsonConverterFactory = GsonConverterFactory.create(GsonBuilder().create())

    abstract fun getBaseUrl(): String

}