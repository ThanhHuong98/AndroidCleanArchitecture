package com.example.baseproject.vm

import androidx.lifecycle.ViewModel
import com.example.baseproject.domain.repository.ABCRepository
import javax.inject.Inject

class MainViewModel @Inject constructor(private val abcRepository: ABCRepository): ViewModel(){
}