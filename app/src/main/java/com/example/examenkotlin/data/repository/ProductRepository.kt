package com.example.examenkotlin.data.repository

import com.example.examenkotlin.data.model.Product
import com.example.examenkotlin.data.remote.RetrofitInstance

class PostRepository {
    private val api = RetrofitInstance.api

    suspend fun getAllProducts(): List<Product> {
        return api.getProducts().results
    }
}