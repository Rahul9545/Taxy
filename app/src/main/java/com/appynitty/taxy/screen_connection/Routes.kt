package com.appynitty.taxy.screen_connection

sealed class Routes(val route: String) {
    object Toolbar : Routes("Toolbar")
    object Splash : Routes("Splash")
    object Login : Routes("Login")
    object Signup : Routes("Signup")
}