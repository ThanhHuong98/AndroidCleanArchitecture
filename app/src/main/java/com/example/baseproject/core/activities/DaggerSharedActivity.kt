package com.example.baseproject.core.activities

import android.os.Bundle
import com.example.baseproject.core.commons.UIBehaviour
import dagger.android.AndroidInjection

abstract class DaggerSharedActivity :BaseActivity(), UIBehaviour {

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
    }

}