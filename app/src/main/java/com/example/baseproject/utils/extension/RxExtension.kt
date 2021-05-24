package com.example.baseproject.utils.extension

import io.reactivex.*
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers


fun Disposable.addTo(compositeDisposable: CompositeDisposable) = compositeDisposable.add(this)

inline fun <reified T> Single<T>.applyScheduler(scheduler: Scheduler): Single<T> =
    subscribeOn(scheduler).observeOn(AndroidSchedulers.mainThread())

inline fun <reified T> applySingleIoScheduler(): SingleTransformer<T, T> {
    return SingleTransformer { single -> single.applyScheduler(Schedulers.io()) }
}
