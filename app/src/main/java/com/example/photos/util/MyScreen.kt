package com.example.photos.util

sealed class MyScreen(val route: String) {

    data object PhotoScreen : MyScreen("photoScreen")

}