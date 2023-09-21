package com.appynitty.taxy.navigation_connection

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.appynitty.taxy.screen_connection.BottomNavItem

@Composable
fun BottomNavigation(navController: NavHostController){

    val items = listOf(
        BottomNavItem.Home,
        BottomNavItem.Call,
        BottomNavItem.Profile,
        BottomNavItem.Favorite
    )
    NavigationBar {
        items.forEach { item ->
            AddItem(
                screen = item,
                navController = navController
            )
        }
    }

}

@Composable
fun RowScope.AddItem(
    screen: BottomNavItem,
    navController: NavHostController
) {
    NavigationBarItem(
        label = {
            Text(text = screen.title, fontSize = 9.sp)
        },
        icon = {
            Icon(imageVector = screen.icon, contentDescription = screen.screen_route)
        },
        selected = true,
        alwaysShowLabel = false,
        onClick = {
        },
        colors = NavigationBarItemDefaults.colors()
    )
}