package com.appynitty.taxy.screen_connection

sealed class Routes(val route: String) {
    object Splash : Routes("Splash")
    object Login : Routes("Login")
}