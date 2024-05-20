package com.example.starter.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.starter.feature.home.homeScreen
import com.example.starter.feature.home.navigateToHome
import com.example.starter.feature.login.Login
import com.example.starter.feature.login.loginScreen
import kotlin.reflect.KClass

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    startDestination: KClass<*> = Login::class
) {
    val navController = rememberNavController()
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ) {
        homeScreen()
        loginScreen(navigateToHome = navController::navigateToHome)
    }
}
