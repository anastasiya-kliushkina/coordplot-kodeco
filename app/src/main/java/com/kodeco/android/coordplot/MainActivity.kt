package com.kodeco.android.coordplot

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.kodeco.android.coordplot.ui.screens.PlotSurfaceScreen
import com.kodeco.android.coordplot.ui.screens.AboutScreen
import com.kodeco.android.coordplot.ui.theme.CoordplotTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        installSplashScreen()

        super.onCreate(savedInstanceState)
        setContent {
            CoordplotTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.White
                ) {
                    MainScreen()
                }
            }
        }
    }
}

@Composable
fun MainScreen() {
    //Keep track of the state of the screens and the back stacks of the screens it manages
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "aboutscreen") {
        composable("aboutscreen") { AboutScreen(onNextClick = { navController.navigate("plotsurfacescreen") }) }
        composable("plotsurfacescreen") { PlotSurfaceScreen() }

    }
}