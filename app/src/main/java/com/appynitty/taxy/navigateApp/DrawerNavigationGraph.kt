package com.appynitty.taxy.navigateApp

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.appynitty.taxy.screen.CallScreen
import com.appynitty.taxy.screen.FavoriteScreen
import com.appynitty.taxy.screen.HomeScreen
import com.appynitty.taxy.screen.ProfileScreen
import com.appynitty.taxy.screen.SettingScreen
import com.appynitty.taxy.screen_connection.DrawerNavItem

@Composable
fun DrawerNavigationGraph(navController: NavHostController){
    //val navController = rememberNavController()
    NavHost(navController =navController , startDestination = DrawerNavItem.Home.drawerRouteScreen){

        composable(DrawerNavItem.Home.drawerRouteScreen) {
            HomeScreen()
        }
        composable(DrawerNavItem.Call.drawerRouteScreen) {
            CallScreen()
        }
        composable(DrawerNavItem.Profile.drawerRouteScreen) {
            ProfileScreen()
        }
        composable(DrawerNavItem.Favorite.drawerRouteScreen) {
            FavoriteScreen()
        }
        composable(DrawerNavItem.Setting.drawerRouteScreen) {
            SettingScreen()
        }
    }
}