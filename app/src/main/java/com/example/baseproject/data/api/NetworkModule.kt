package com.example.baseproject.data.api

import com.example.baseproject.data.api.base.GithubSyncCoordinator
import com.example.baseproject.data.api.base.SharedNetworkModule
import com.example.baseproject.data.api.services.CharacterNetworkService
import javax.inject.Inject

class NetworkModule @Inject constructor(): SharedNetworkModule() {
    override fun getBaseUrl(): String {
       return GithubSyncCoordinator.rickandmortyApi()
    }

    fun getNetworkService() = getService<CharacterNetworkService>()
}