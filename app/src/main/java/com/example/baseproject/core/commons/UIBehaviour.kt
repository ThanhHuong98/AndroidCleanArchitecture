package com.example.baseproject.core.commons

import android.os.Bundle

interface UIBehaviour {

    fun onSyncViews(savedInstanceState: Bundle?)

    fun onSyncEvents()

    fun onSyncData()
}