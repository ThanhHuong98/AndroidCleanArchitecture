package com.example.baseproject.vm
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.baseproject.core.vm.BaseViewModel
import com.example.baseproject.data.models.User
import com.example.baseproject.domain.repository.ABCRepository
import com.example.baseproject.utils.extension.addTo
import com.example.baseproject.utils.extension.applySingleIoScheduler
import kotlinx.coroutines.launch

import javax.inject.Inject

class MainViewModel @Inject constructor(private val repository: ABCRepository): BaseViewModel() {

    private val _users: MutableLiveData<List<User>> = MutableLiveData()
    val users: LiveData<List<User>> = _users

    private val _title: MutableLiveData<String> = MutableLiveData()
    val title: LiveData<String> = _title

    // handle long-task by RxJava
    fun getUsers() {
        repository.getUsers()
            .compose(applySingleIoScheduler())
            .subscribe({
                       _users.postValue(it.data)
            }, {
                it.printStackTrace()
            })
            .addTo(getCompositeDisposable())
    }

    // Handle long-task by coroutine
    fun refershTitle() {
        viewModelScope.launch {
            try {
                val result = repository.fetchNextTitle()
                _title.postValue(result)
            } catch (error: Throwable) {
                _title.postValue(error.message)
            }
        }

    }




}