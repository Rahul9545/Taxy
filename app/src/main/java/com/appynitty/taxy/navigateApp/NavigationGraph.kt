package com.appynitty.taxy.navigateApp

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.appynitty.taxy.screen.CallScreen
import com.appynitty.taxy.screen.FavoriteScreen
import com.appynitty.taxy.screen.HomeScreen
import com.appynitty.taxy.screen.NotificationsScreen
import com.appynitty.taxy.screen.ProfileScreen
import com.appynitty.taxy.screen_connection.BottomNavItem

@Composable
fun NavigationGraph(navController: NavHostController, paddingValues: PaddingValues){
        NavHost(navController =navController , startDestination = BottomNavItem.Home.screen_route){
                composable(BottomNavItem.Home.screen_route) {
                        HomeScreen()
                }
                composable(BottomNavItem.Call.screen_route) {
                        CallScreen()
                }
                composable(BottomNavItem.Profile.screen_route) {
                        ProfileScreen()
                }
                composable(BottomNavItem.Favorite.screen_route) {
                        FavoriteScreen()
                }
                composable(BottomNavItem.Notifications.screen_route) {
                        NotificationsScreen()
                }
        }
}