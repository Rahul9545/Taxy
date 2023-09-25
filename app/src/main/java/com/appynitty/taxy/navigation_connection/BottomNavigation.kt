package com.appynitty.taxy.navigation_connection

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.appynitty.taxy.screen_connection.BottomNavItem
import com.appynitty.taxy.screen_connection.Routes
import com.appynitty.taxy.ui.theme.colorPrimary

@Composable
fun BottomNavigation(navController: NavHostController){
   //val navController = rememberNavController()
    val selectedTab = remember { mutableStateOf(0) }
    val items = listOf(
        BottomNavItem.Home,
        BottomNavItem.Call,
        BottomNavItem.Profile,
        BottomNavItem.Favorite
    )
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination?.route
    NavigationBar {
        items.forEach { item ->
            AddItem(
                screen = item,
                //selectedTab = selectedTab,
                navController = navController,
                currentDestination = currentDestination
            )
        }
    }
}
@Composable
fun RowScope.AddItem(
    screen: BottomNavItem,
    //selectedTab: MutableState<Int>,
    navController: NavHostController,
    currentDestination: NavDestination?
) {
    NavigationBarItem(
        label = {
            Text(text = screen.title, fontSize = 9.sp)
        },
        icon = {
            Icon(imageVector = screen.icon, contentDescription = screen.title)
        },
       // selected = selectedTab == screen,
        selected = currentDestination?.hierarchy?.any { it.route == screen.screen_route } == true,
        alwaysShowLabel = true,
        onClick = {
            /*navController.navigate(screen.screen_route){
                when (screen.screen_route == screen.title) {

                    (screen.screen_route == "Home") -> {
                        navController.navigate(BottomNavItem.Home.screen_route)
                    }
                    (screen.screen_route == "Call") -> {
                        navController.navigate(BottomNavItem.Call.screen_route)
                    }
                    (screen.screen_route == "Profile") -> {
                        navController.navigate(BottomNavItem.Profile.screen_route)
                    }
                    (screen.screen_route == "Favorite") -> {
                        navController.navigate(BottomNavItem.Favorite.screen_route)
                    }
                    else -> {}
                }
            }*/

            navController.navigate(screen.screen_route) {
                navController.graph.findStartDestination().route?.let {
                    popUpTo(it){
                        saveState = true
                    }
                }
                launchSingleTop = true
                restoreState = true
            }
        },
        colors = NavigationBarItemDefaults.colors(),
        modifier = Modifier.background(colorPrimary)
    )
}