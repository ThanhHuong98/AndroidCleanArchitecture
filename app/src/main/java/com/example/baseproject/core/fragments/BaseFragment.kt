package com.example.baseproject.core.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.baseproject.core.commons.UIBehaviour

open class BaseFragment : Fragment(), UIBehaviour {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        onSyncViews(savedInstanceState)
        onSyncEvents()
        onSyncData()
    }
    override fun onSyncViews(savedInstanceState: Bundle?) {

    }

    override fun onSyncEvents() {

    }

    override fun onSyncData() {

    }
}