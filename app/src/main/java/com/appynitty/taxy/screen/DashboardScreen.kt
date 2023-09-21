package com.appynitty.taxy.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.appynitty.taxy.navigateApp.NavigationGraph
import com.appynitty.taxy.navigation_connection.BottomNavigation

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashboardScreen(navController: NavHostController) {

    Scaffold(
        topBar = { CustomToolbarScreen(navController = navController, title = "Dashboard", false) }

    ) { innerPadding ->
        Column(
            modifier = Modifier.padding(innerPadding),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Scaffold (
                bottomBar = {
                    BottomAppBar {
                        BottomNavigation(navController)
                    }
                }
            ) { innerPadding ->

                Text(text = "", modifier = Modifier.padding(innerPadding))
               // NavigationGraph(navController = navController, innerPadding)
            }
        }
    }
}