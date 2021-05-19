package com.example.hiltexercise.ui.main

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.View
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.hiltexercise.R
import com.example.hiltexercise.data.Repository
import com.example.hiltexercise.di.qualifier.AppHash
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_second.*
import javax.inject.Inject

@AndroidEntryPoint
class SecondFragment : Fragment(R.layout.fragment_second) {

    private val mainViewModel by viewModels<MainViewModel>()

    @Inject
    lateinit var repository : Repository

    @AppHash
    @Inject
    lateinit var appHash: String

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_back.setOnClickListener {
            findNavController().navigate(R.id.action_secondFragment_to_mainFragment)
        }

        Log.d("SecondFragment", appHash)
    }
}