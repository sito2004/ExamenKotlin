package com.example.examenkotlin.data.model

data class PagedResponse(
    val page: Int,
    val per_page: Int,
    val total: Int,
    val total_pages: Int,
    val results: List<Product>
)