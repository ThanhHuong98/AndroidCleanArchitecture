package com.example.baseproject.vm
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.baseproject.core.vm.BaseViewModel
import com.example.baseproject.data.models.Character
import com.example.baseproject.data.models.CharacterList
import com.example.baseproject.data.models.User
import com.example.baseproject.domain.repository.CharacterRepository
import com.example.baseproject.utils.extension.addTo
import com.example.baseproject.utils.extension.applySingleIoScheduler
import kotlinx.coroutines.launch
import java.lang.Exception

import javax.inject.Inject

class MainViewModel @Inject constructor(private val repository: CharacterRepository): BaseViewModel() {

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

    // Handle long-task by coroutine -> using SkipNetWorkInterceptor to test this function
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

    private val _characterList: MutableLiveData<List<Character>> = MutableLiveData()
    val characterList: LiveData<List<Character>> = _characterList

    fun fetchCharacters() {
        viewModelScope.launch {
            try {
                val result = repository.getAllCharacters()
                val data = result.body()?.characterList?: emptyList<Character>()
                _characterList.postValue(data)
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }


}