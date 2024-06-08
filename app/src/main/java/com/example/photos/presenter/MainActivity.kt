package com.example.photos.presenter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
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
        enableEdgeToEdge()
        setContent {
            PhotosTheme {
                Scaffold( modifier = Modifier.fillMaxSize() ) { innerPadding ->



                }
            }
        }
    }
}

@Composable
fun MainUi(){

    Surface(
        modifier = Modifier.fillMaxSize()
    ) {

        NavScreen()

    }
}

@Composable
fun NavScreen(){

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = MyScreen.PhotoScreen.route){

        composable(MyScreen.PhotoScreen.route){
            PhotoScreen()
        }

    }

}

