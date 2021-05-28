package com.example.baseproject.presentation.character

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.baseproject.R
import com.example.baseproject.core.fragments.DaggerSharedFragment
import com.example.baseproject.databinding.FragmentCharactersBinding
import com.example.baseproject.presentation.character.adapter.CharacterAdapter
import com.example.baseproject.vm.MainViewModel
import javax.inject.Inject

class CharactersFragment : DaggerSharedFragment() {

    private lateinit var binding: FragmentCharactersBinding

    @Inject
    lateinit var mainViewModel: MainViewModel

    private var adapter: CharacterAdapter ?= null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_characters, container,false)
        return binding.root
    }

    override fun onSyncViews(savedInstanceState: Bundle?) {
        super.onSyncViews(savedInstanceState)

        adapter = CharacterAdapter()
        binding.apply {
            recyclerView.adapter = adapter
        }

        binding.btnTest.setOnClickListener { onSyncData() }
    }


    override fun onSyncEvents() {
        super.onSyncEvents()
        mainViewModel.characterList.observe(this) {
                adapter?.submitList(it)
        }
    }

    override fun onSyncData() {
        super.onSyncData()
        mainViewModel.fetchCharacters()
    }
}