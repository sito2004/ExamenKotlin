package com.example.examenkotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge

import com.example.examenkotlin.ui.screens.PostScreen
import com.example.examenkotlin.ui.theme.ExamenKotlinTheme
import com.example.examenkotlin.ui.screens.PostScreen
import com.example.examenkotlin.ui.theme.ExamenKotlinTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ExamenKotlinTheme {
                PostScreen()
            }
        }
    }
}