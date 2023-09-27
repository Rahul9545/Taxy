package com.appynitty.taxy.navigation_connection

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.DrawerState
import androidx.compose.material.DrawerValue
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.primarySurface
import androidx.compose.material.rememberDrawerState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.appynitty.taxy.R
import com.appynitty.taxy.screen_connection.DrawerNavItem
import com.appynitty.taxy.ui.theme.TaxyTheme
import com.appynitty.taxy.ui.theme.colorPrimary


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DrawerNavComplete(
    navController: NavHostController = rememberNavController(),
    drawerState: DrawerState = rememberDrawerState(initialValue = DrawerValue.Open)
){
    ModalNavigationDrawer(
        drawerContent = {
            ModalDrawerSheet {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.Green),
                    contentAlignment = Alignment.Center
                ) {
                    Text(text = "Drawer")
                }
            }
        }
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(White),
            contentAlignment = Alignment.Center
        ) {
            Text(text = "Content Page")
        }
    }
}

@Composable
fun DrawerNavHeader(navController: NavHostController){
    Box (
        modifier = Modifier
            .fillMaxWidth(1f)
            .height(200.dp)
            .background(/*colorPrimary*/
                brush = Brush.horizontalGradient(
                    listOf(
                        colorPrimary,
                        Color(0xFF755CD4),
                        Color(0xFF4C48C1)
                    )
                )
            ),
        contentAlignment = Alignment.Center,
    ) {
        Column(
            modifier = Modifier.padding(2.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Box (
                contentAlignment= Alignment.Center,
                modifier = Modifier
                    .size(92.dp)
                    .border(
                        width = 1.dp,
                        color = Color.Black,
                        shape = /*RoundedCornerShape(50.dp)*/ CircleShape
                    )
            ){
                Image(
                    painter = painterResource(id = R.drawable.ic_taxy_sp),
                    contentDescription = "Rahul",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(94.dp)
                        .clip(CircleShape)
                )
            }
            Spacer(Modifier.height(4.dp))
            Text(text = "Rahul Rokade",
                style = MaterialTheme.typography.body2,
                color = Color.White,
                textAlign = TextAlign.Justify,
                modifier = Modifier.padding(5.dp)
            )
            Spacer(Modifier.height(5.dp))
            Text(text = "rrokade1793@gmail.com",
                style = MaterialTheme.typography.body2,
                color = Color.White,
                textAlign = TextAlign.Justify,
                modifier = Modifier.padding(5.dp)
            )
            Spacer(Modifier.height(5.dp))
        }
    }
}

@Composable
fun DrawerNavCenterView(navController: NavHostController){

    val drawerItem = arrayOf(
        DrawerNavItem.Home,
        DrawerNavItem.Call,
        DrawerNavItem.Favorite,
        DrawerNavItem.Setting
    )
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination


}

@Composable
fun DrawerNavFooter(navController: NavHostController){
    Box (
        modifier = Modifier
            .fillMaxWidth(1f)
            .height(60.dp)
            .background(MaterialTheme.colors.primarySurface),
        contentAlignment = Alignment.CenterStart
    ){
        Row (
            modifier = Modifier.fillMaxWidth(1f),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Text(
                text = "Version Name: 1.0",
                modifier = Modifier
                    .padding(10.dp),
                textAlign = TextAlign.Start,
                color = White,
            )

            Text(
                text = "Logout",
                modifier = Modifier
                    .padding(10.dp),
                textAlign = TextAlign.End,
                color = White,
            )
        }
    }

}

@Preview(showBackground = true)
@Composable
fun DrawerNavHeaderPreview() {
    TaxyTheme {
        val navController = rememberNavController()
        DrawerNavHeader(navController)
    }
}

@Preview(showBackground = true)
@Composable
fun DrawerNavFooterPreview() {
    TaxyTheme {
        val navController = rememberNavController()
        DrawerNavFooter(navController)
    }
}
@Preview(showBackground = true)
@Composable
fun DrawerNavCenterViewPreview() {
    TaxyTheme {
        val navController = rememberNavController()
        DrawerNavCenterView(navController)
    }
}

@Preview(showBackground = true)
@Composable
fun DrawerNavCompleteViewPreview() {
    TaxyTheme {
        val navController = rememberNavController()
        DrawerNavComplete(navController)
    }
}