package com.example.baseproject.data.repository

import com.example.baseproject.data.api.base.BaseResponse
import com.example.baseproject.data.api.services.CharacterNetworkService
import com.example.baseproject.data.models.CharacterList
import com.example.baseproject.data.models.User
import com.example.baseproject.domain.repository.CharacterRepository
import io.reactivex.Single
import retrofit2.Response
import javax.inject.Inject

class CharacterRepositoryImpl @Inject constructor(private val service: CharacterNetworkService) : CharacterRepository {
    override fun getUsers(): Single<BaseResponse<List<User>>> {
        return service.getUsersByName("abc")
    }

    override suspend fun fetchNextTitle(): String {
        return service.fetchNextTitle()
    }

    override suspend fun getAllCharacters(): Response<CharacterList> {
        return service.getAllCharacters()
    }

}