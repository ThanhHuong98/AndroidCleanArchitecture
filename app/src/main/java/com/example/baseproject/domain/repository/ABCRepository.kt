package com.example.baseproject.domain.repository

import com.example.baseproject.data.api.base.BaseResponse
import com.example.baseproject.data.models.CharacterList
import com.example.baseproject.data.models.User
import io.reactivex.Single
import retrofit2.Response

interface ABCRepository {
    fun getUsers() : Single<BaseResponse<List<User>>>

    suspend fun fetchNextTitle(): String

    suspend fun getAllCharacters(): Response<CharacterList>
}