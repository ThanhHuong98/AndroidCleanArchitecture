package com.example.baseproject.core.vm

import androidx.lifecycle.ViewModel
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

interface HasDisposableManager {
    fun getCompositeDisposable(): CompositeDisposable
    fun addToDisposable(disposable: Disposable)
    fun disposeAll()
}

open class BaseViewModel : ViewModel(), HasDisposableManager {

    private var compositeDisposable = CompositeDisposable()

    override fun getCompositeDisposable(): CompositeDisposable {
        if (compositeDisposable.isDisposed)
            compositeDisposable = CompositeDisposable()
        return compositeDisposable
    }

    override fun addToDisposable(disposable: Disposable) {
        this.compositeDisposable.add(disposable)
    }

    override fun disposeAll() {
        getCompositeDisposable().clear()
    }

    override fun onCleared() {
        disposeAll()
        super.onCleared()
    }
}