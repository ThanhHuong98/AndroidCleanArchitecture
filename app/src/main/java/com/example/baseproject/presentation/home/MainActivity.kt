package com.example.baseproject.presentation.home
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.baseproject.MyApplication
import com.example.baseproject.R
import com.example.baseproject.vm.MainViewModel
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {

        (application as MyApplication).appComponent.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}