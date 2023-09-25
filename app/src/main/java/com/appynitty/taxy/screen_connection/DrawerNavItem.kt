package com.appynitty.taxy.screen_connection

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.ui.graphics.vector.ImageVector

sealed class DrawerNavItem(var title:String, var icon: ImageVector, var drawerRouteScreen:String){
    object Home : DrawerNavItem("Home", Icons.Filled.Home, "HomeScreen")
    object Call: DrawerNavItem("Call", Icons.Filled.Call,"Call")
    object Profile: DrawerNavItem("Profile", Icons.Filled.Person,"Profile")
    object Favorite: DrawerNavItem("Favorite", Icons.Filled.Favorite,"Favorite")
    object Setting: DrawerNavItem("Setting", Icons.Filled.Favorite,"Setting")
}
