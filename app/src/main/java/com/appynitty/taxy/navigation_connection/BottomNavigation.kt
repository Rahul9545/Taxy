package com.appynitty.taxy.navigation_connection

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.appynitty.taxy.screen_connection.BottomNavItem
import com.appynitty.taxy.ui.theme.colorPrimary

@Composable
fun BottomNavigation(){
    val navController = rememberNavController()
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
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route
    NavigationBarItem(
        label = {
            Text(text = screen.title, fontSize = 9.sp)
        },
        icon = {
            Icon(imageVector = screen.icon, contentDescription = screen.title)
        },
        selected = currentRoute == screen.screen_route,
        alwaysShowLabel = true,
        onClick = {
                  //item click not working

                  /*when (screen.screen_route) {
                      BottomNavItem.Home.screen_route -> {
                          navController.navigate(BottomNavItem.Home.screen_route)
                      }
                      BottomNavItem.Call.screen_route -> {
                          navController.navigate(BottomNavItem.Call.screen_route)
                      }
                      BottomNavItem.Profile.screen_route -> {
                          navController.navigate(BottomNavItem.Profile.screen_route)
                      }
                      BottomNavItem.Favorite.screen_route -> {
                          navController.navigate(BottomNavItem.Favorite.screen_route)
                      }
                  }*/


            /*navController.navigate(screen.screen_route){
                        navController.graph.startDestinationRoute?.let{

                            popUpTo(it) {
                                saveState = true
                            }

                        }
                      launchSingleTop = true
                      restoreState = true
            }*/
        },
        colors = NavigationBarItemDefaults.colors(),
        enabled = true,
        modifier = Modifier.background(colorPrimary)
    )
}