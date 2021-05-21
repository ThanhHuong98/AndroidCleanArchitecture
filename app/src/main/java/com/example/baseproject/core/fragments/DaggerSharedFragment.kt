package com.example.baseproject.core.fragments

import android.content.Context
import com.example.baseproject.core.commons.UIBehaviour
import dagger.android.support.AndroidSupportInjection

open class DaggerSharedFragment : BaseFragment(), UIBehaviour {

    override fun onAttach(context: Context) {
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
    }

}