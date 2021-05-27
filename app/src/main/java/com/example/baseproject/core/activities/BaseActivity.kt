package com.example.baseproject.core.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.baseproject.core.commons.UIBehaviour

open class BaseActivity : AppCompatActivity(), UIBehaviour {


    /**
     * Handle lifecycle here
     * */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        onSyncViews(savedInstanceState)
        onSyncEvents()
        onSyncData()
    }

    override fun onPause() {
        super.onPause()
        //TODO when Pause activity
    }

    override fun onResume() {
        super.onResume()
        //TODO when Resume activity
    }

    override fun onStop() {
        super.onStop()
        //TODO when Stop activity
    }

    override fun onDestroy() {
        super.onDestroy()
        //TODO when Destroy activity
    }

    override fun onSyncViews(savedInstanceState: Bundle?) = Unit

    override fun onSyncEvents() = Unit

    override fun onSyncData() = Unit

    /**
     * Besides, you can handle some task - override functions
     * Language setting
     *
     * */
}