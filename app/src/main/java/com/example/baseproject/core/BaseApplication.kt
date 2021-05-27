package com.example.baseproject.core

import androidx.lifecycle.LifecycleObserver
import dagger.android.support.DaggerApplication

abstract class BaseApplication : DaggerApplication(), LifecycleObserver {
    /**
     * Language setting
     * Share Preferences instance
     * Crash report
     * configuration Change
     * more ...
     * */

}