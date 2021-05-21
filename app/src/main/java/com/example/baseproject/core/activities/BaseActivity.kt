package com.example.baseproject.core.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.baseproject.core.commons.UIBehaviour

open class BaseActivity : AppCompatActivity(), UIBehaviour {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        onSyncViews(savedInstanceState)
        onSyncEvents()
        onSyncData()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onSyncViews(savedInstanceState: Bundle?) = Unit

    override fun onSyncEvents() = Unit

    override fun onSyncData() = Unit
}