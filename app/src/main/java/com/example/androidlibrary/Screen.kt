package com.example.androidlibrary

sealed class Screen(val route: String) {
    object OnboardingScreen: Screen("onboarding_screen")
    object HomeScreen: Screen("home_screen")
}
