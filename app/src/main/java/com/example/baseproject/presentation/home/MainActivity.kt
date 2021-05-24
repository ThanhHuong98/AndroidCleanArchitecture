package com.example.baseproject.presentation.home
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.observe
import com.example.baseproject.R
import com.example.baseproject.core.activities.DaggerSharedActivity
import com.example.baseproject.vm.MainViewModel
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : DaggerSharedActivity() {
    @Inject
    lateinit var mainViewModel: MainViewModel

    override fun onSyncViews(savedInstanceState: Bundle?) {
        super.onSyncViews(savedInstanceState)
        setContentView(R.layout.activity_main)

        loading.setOnClickListener {
            mainViewModel.refershTitle()
        }
    }

    override fun onSyncData() {
        super.onSyncData()

        mainViewModel.title.observe(this) {
            text.text = it ?:""
        }

    }

}