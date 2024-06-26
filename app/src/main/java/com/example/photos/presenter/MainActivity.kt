package com.example.photos.presenter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.photos.presenter.screen.PhotoScreen
import com.example.photos.presenter.ui.theme.PhotosTheme
import com.example.photos.presenter.viewModel.MainViewModel
import com.example.photos.util.MyScreen
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            PhotosTheme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ){
                    MainUi(viewModel)
                }
            }
        }
    }
}

@Composable
fun MainUi(viewModel: MainViewModel) {

    Column(
        modifier = Modifier.fillMaxSize()
    ) {

        NavScreen(viewModel)

    }
}

@Composable
fun NavScreen(viewModel: MainViewModel) {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = MyScreen.PhotoScreen.route){

        composable(MyScreen.PhotoScreen.route){
            PhotoScreen(viewModel)
        }

    }

}

