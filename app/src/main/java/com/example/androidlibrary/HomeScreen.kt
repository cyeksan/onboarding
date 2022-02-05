package com.example.androidlibrary

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen() {

    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text(text = "HOME PAGE", fontSize = 24.sp)
    }
}