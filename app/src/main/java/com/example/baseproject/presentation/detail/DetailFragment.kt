package com.example.baseproject.presentation.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.baseproject.R
import com.example.baseproject.core.fragments.BaseFragment
import com.example.baseproject.core.fragments.DaggerSharedFragment

class DetailFragment : DaggerSharedFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_detail_character, container, false)
    }
}