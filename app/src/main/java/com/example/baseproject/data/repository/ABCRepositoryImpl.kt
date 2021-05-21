package com.example.baseproject.data.repository

import com.example.baseproject.data.api.services.ABCNetworkService
import com.example.baseproject.data.models.ABCData
import com.example.baseproject.domain.repository.ABCRepository
import javax.inject.Inject

class ABCRepositoryImpl @Inject constructor(private val service: ABCNetworkService) : ABCRepository {
    override fun getUsers(): List<ABCData> {
        TODO("Not yet implemented")
    }
}