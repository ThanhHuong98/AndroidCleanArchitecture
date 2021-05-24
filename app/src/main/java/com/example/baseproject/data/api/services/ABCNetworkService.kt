package com.example.baseproject.data.api.services

import com.example.baseproject.data.api.base.BaseResponse
import com.example.baseproject.data.models.User
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface ABCNetworkService {
    @GET("users")
    fun getUsersByName(
        @Query("username") username: String
    ) : Single<BaseResponse<List<User>>>

    @GET("next_title.json")
    suspend fun fetchNextTitle() : String
}