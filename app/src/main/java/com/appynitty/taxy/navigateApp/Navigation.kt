package com.appynitty.taxy.navigateApp

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.appynitty.taxy.screen.CustomToolbarScreen
import com.appynitty.taxy.screen.DashboardScreen
import com.appynitty.taxy.screen.ForgotPasswordScreen
import com.appynitty.taxy.screen.LoginScreen
import com.appynitty.taxy.screen.SignupScreen
import com.appynitty.taxy.screen.SplashScreen
import com.appynitty.taxy.screen_connection.Routes

@Composable
fun Navigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Routes.Splash.route) {

        composable(Routes.Splash.route) {
            SplashScreen(navController = navController)
        }
        composable(Routes.Login.route) {
            LoginScreen(navController = navController)
        }
        composable(Routes.Signup.route) {
            SignupScreen(navController = navController)
        }
        composable(Routes.Toolbar.route) {
            CustomToolbarScreen(navController = navController, title = String(), isBack = true)
        }
        composable(Routes.ForgotPass.route) {
            ForgotPasswordScreen(navController = navController)
        }
        composable(Routes.Dashboard.route) {
            DashboardScreen(navController = navController)
        }
    }
}