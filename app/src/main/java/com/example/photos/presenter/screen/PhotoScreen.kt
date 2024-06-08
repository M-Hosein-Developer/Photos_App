package com.example.photos.presenter.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun PhotoScreen() {

    Column(
        Modifier.fillMaxSize()
    ) {

        ToolbarPhotoScreen()

    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ToolbarPhotoScreen(){

    TopAppBar(
        title = { Text(text = "Home")},
    )

}