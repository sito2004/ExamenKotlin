package com.example.examenkotlin.data.remote

import com.example.examenkotlin.data.model.PagedResponse
import retrofit2.http.GET

interface PostApi {
        // Esto llamará a https://peticiones.online/api/products
        @GET("products")
        suspend fun getProducts(): PagedResponse
}