package com.example.examenkotlin.data.remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    // La base es /api/, el resto se pone en el @GET de la interfaz
    private const val BASE_URL = "https://peticiones.online/api/"

    val api: PostApi by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(PostApi::class.java)
    }
}