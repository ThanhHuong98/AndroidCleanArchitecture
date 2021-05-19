package com.example.baseproject.data.api.base

object GithubSyncCoordinator {

    @JvmStatic
    fun isDebug() : Boolean {
        return true
    }

    @JvmStatic
    fun githubService() : String {
        return "https://api.github.com"
    }

}