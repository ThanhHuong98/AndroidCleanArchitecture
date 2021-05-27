package com.example.baseproject.core.commons

import android.os.Bundle

interface UIBehaviour {

    /**
     * This method used to define what happens with views: onLick, onTextChanged
     * @param savedInstanceState to object for state
     * */

    fun onSyncViews(savedInstanceState: Bundle?)

    /**
     * This method used to observe events
     * */

    fun onSyncEvents()

    /**
     * This method used to get Data as: call api, read from local file
     */

    fun onSyncData()

    /**
     * In additions, you can add some general methods which is necessary for you activity/fragment her
     * showLoading(isShow: Boolean)
     * showLoading(isShow: Boolean, timeout: Long)
     * makeVibrator()
     * more ...
     * */
}