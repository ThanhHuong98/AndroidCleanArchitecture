package com.example.baseproject.data.api

import com.example.baseproject.data.api.base.BaseResponse
import com.example.baseproject.data.api.base.GithubSyncCoordinator
import com.example.baseproject.data.api.base.SharedNetworkModule
import com.example.baseproject.data.api.services.ABCNetworkService
import com.example.baseproject.data.models.CharacterList
import retrofit2.Response
import javax.inject.Inject

class ABCNetworkModule @Inject constructor(): SharedNetworkModule() {
    override fun getBaseUrl(): String {
       return GithubSyncCoordinator.rickandmortyApi()
    }

    fun getNetworkService() = getService<ABCNetworkService>()
}