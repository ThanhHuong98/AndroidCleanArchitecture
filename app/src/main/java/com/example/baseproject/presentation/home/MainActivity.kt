package com.example.baseproject.presentation.home
import android.os.Bundle
import com.example.baseproject.R
import com.example.baseproject.core.activities.DaggerSharedActivity
import com.example.baseproject.vm.MainViewModel
import javax.inject.Inject

class MainActivity : DaggerSharedActivity() {
    @Inject
    lateinit var mainViewModel: MainViewModel

    override fun onSyncViews(savedInstanceState: Bundle?) {
        super.onSyncViews(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}