package com.example.hiltexercise.ui.main

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.example.hiltexercise.data.Repository

class MainViewModel @ViewModelInject constructor(
    private val repository: Repository
): ViewModel() {

    fun getRepositoryHash() = repository.hashCode().toString()
}