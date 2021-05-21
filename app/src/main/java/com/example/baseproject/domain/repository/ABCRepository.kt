package com.example.baseproject.domain.repository

import com.example.baseproject.data.models.ABCData

interface ABCRepository {
    fun getUsers() : List<ABCData>
}