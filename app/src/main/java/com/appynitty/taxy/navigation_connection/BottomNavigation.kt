package com.appynitty.taxy.navigation_connection

import androidx.compose.material3.BottomAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.appynitty.taxy.screen_connection.BottomNavItem

@Composable
fun BottomNavigation(navController: NavController){

    val items = listOf(
        BottomNavItem.Home,
        BottomNavItem.Call,
        BottomNavItem.Profile,
        BottomNavItem.Favorite ,
        BottomNavItem.Notifications
    )

    BottomAppBar {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentDestination = navBackStackEntry?.destination


        items.forEach { BottomNavItem ->

        }
    }

}