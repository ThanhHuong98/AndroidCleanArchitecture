package com.example.baseproject.data.api

import com.example.baseproject.data.api.base.GithubSyncCoordinator
import com.example.baseproject.data.api.base.SharedNetworkModule
import com.example.baseproject.data.api.services.ABCNetworkService

class ABCNetworkModule : SharedNetworkModule() {
    override fun getBaseUrl(): String {
       return GithubSyncCoordinator.githubService()
    }

    fun getNetworkService() = getService<ABCNetworkService>()
}