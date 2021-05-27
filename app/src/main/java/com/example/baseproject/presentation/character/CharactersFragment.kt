package com.example.baseproject.presentation.character

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.baseproject.R
import com.example.baseproject.core.fragments.DaggerSharedFragment
import com.example.baseproject.vm.MainViewModel
import kotlinx.android.synthetic.main.fragment_characters.*
import javax.inject.Inject

class CharactersFragment : DaggerSharedFragment() {

    @Inject
    lateinit var mainViewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_characters, container, false)
    }

    override fun onSyncEvents() {
        super.onSyncEvents()

        btnTest.setOnClickListener {
            mainViewModel.fetchCharacters()
        }
    }

    override fun onSyncData() {
        super.onSyncData()
        mainViewModel.fetchCharacters()
    }
}