package com.appynitty.taxy.screen_connection

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavItem(var title:String, var icon: ImageVector, var screen_route:String){
    object Home : BottomNavItem("Home", Icons.Filled.Home, "omeScreen")
    object Call: BottomNavItem("Call",Icons.Filled.Call,"Call")
    object Profile: BottomNavItem("Profile",Icons.Filled.Person,"Profile")
    object Favorite: BottomNavItem("Favorite",Icons.Filled.Favorite,"Favorite")
    object Notifications: BottomNavItem("Notifications",Icons.Filled.Notifications,"Notifications")

}
