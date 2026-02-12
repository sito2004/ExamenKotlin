package com.example.examenkotlin.presentation.viewmodel

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.examenkotlin.data.model.Product
import com.example.examenkotlin.data.repository.PostRepository
import kotlinx.coroutines.launch

class PostViewModel : ViewModel() {
    private val repository = PostRepository()

    private val _products = mutableStateOf<List<Product>>(emptyList())
    val products: State<List<Product>> = _products

    init {
        fetchProducts()
    }

    private fun fetchProducts() {
        viewModelScope.launch {
            try {
                val list = repository.getAllProducts()
                _products.value = list
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
}