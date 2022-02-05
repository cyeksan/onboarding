package com.example.androidlibrary

import android.os.Bundle
import android.view.WindowManager
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp
import androidx.lifecycle.lifecycleScope
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.androidlibrary.ui.theme.AndroidLibraryTheme
import com.example.androidlibrary.ui.theme.UnselectedDot
import com.example.onboarding.OnboardingScreen
import com.example.onboarding.properties.OnboardingProperties


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )
        super.onCreate(savedInstanceState)
        val imageIdList = listOf(
            R.drawable.ic_android,
            R.drawable.ic_cloud_circle,
            R.drawable.ic_eternity,
        )
        val pageNum = 3

        val titleList = listOf(
            "What is Lorem Ipsum?",
            "Where does it come from?",
            "Why do we use it?"
        )

        val descriptionList = listOf(
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry.",
            "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.",
            "It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.",
        )
        val titleColorList = listOf(
            Color.White,
            Color.White,
            Color.White
        )

        val descriptionColorList = listOf(
            Color.White,
            Color.White,
            Color.White
        )
        val backgroundColorEndList = listOf(
            Color.DarkGray,
            Color.Blue,
            Color.DarkGray
        )

        val backgroundColorStartList = listOf(
            Color.Magenta,
            Color.Magenta,
            Color.Magenta
        )
        setContent {
            AndroidLibraryTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                    val navController = rememberNavController()
                    NavHost(
                        navController = navController,
                        startDestination = Screen.OnboardingScreen.route
                    ) {

                        composable(
                            route = Screen.OnboardingScreen.route
                        ) {
                            OnboardingScreen(
                                imageIdList = imageIdList,
                                navController = navController,
                                lifecycleCoroutineScope = lifecycleScope,
                                pageNum = pageNum, // It must be between 3 and 5 (both inclusive)
                                titleList = titleList,
                                descriptionList = descriptionList,
                                skipTo = Screen.HomeScreen.route,
                                properties = OnboardingProperties(
                                    titleColorList = titleColorList,
                                    descriptionColorList = descriptionColorList,
                                    backgroundColorStartList = backgroundColorStartList,
                                    backgroundColorEndList = backgroundColorEndList,
                                    buttonColor = Color.White,
                                    selectedDotColor = Color.White,
                                    unselectedDotColor = UnselectedDot,
                                    imageContentScale = ContentScale.Crop,
                                    titleFontSize = 24.sp,
                                    descriptionFontSize = 16.sp,
                                    titleFontFamily = FontFamily.Default,
                                    descriptionFontFamily = FontFamily.Default,
                                    skipButtonName = "SKIP",
                                    nextButtonName = "NEXT",
                                    nextArrowIconDrawableId = R.drawable.next_arrow
                                )
                            )
                        }
                        composable(
                            route = Screen.HomeScreen.route
                        ) {
                            HomeScreen()
                        }
                    }
                }
            }
        }
    }
}

