package com.example.hiltexercise.ui.second

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hiltexercise.R
import com.example.hiltexercise.data.Repository
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class SecondActivity : AppCompatActivity() {

    @Inject
    lateinit var repository : Repository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }
}