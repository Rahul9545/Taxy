package com.appynitty.taxy.navigation_connection

import android.util.Size
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.RoundRect
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.appynitty.taxy.R


@Composable
fun DrawerNavComplete(navController: NavHostController){
   val modifier: Modifier = Modifier
    val onDestinationClicked: (route: String) -> Unit

    Box (
        modifier = modifier
            .verticalScroll(rememberScrollState())
    ){
        Column(
            modifier
                .fillMaxSize()
        ) {
            Row (
                modifier = modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .background(
                        brush = Brush.horizontalGradient(
                            listOf(
                                Color(0xFF966DE7),
                                Color(0xFF755CD4),
                                Color(0xFF4C48C1)
                            )
                        )
                    ),
                verticalAlignment = Alignment.CenterVertically,
            ){
                Column (
                    modifier = modifier.padding(15.dp)
                ) {
                    Text(text = "meshramaravind@gmail.com",
                        style = MaterialTheme.typography.h5,
                        color = Color.Yellow
                    )
                    Spacer(Modifier.height(4.dp))
                    Text(text = "meshramaravind@gmail.com",
                        style = MaterialTheme.typography.body2,
                        color = Color.Green
                    )
                    Image(painter = painterResource(R.drawable.ic_person_pin), contentDescription =  "avatar",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(64.dp)
                            .clip(CircleShape))

                    Spacer(Modifier.height(4.dp))
                    Text(text = "Rahul",
                        style = MaterialTheme.typography.body2,
                        color = Color.Green
                    )
                }
            }
        }
    }

}

@Composable
fun DrawerNavHeader(

    ){
}

@Composable
fun DrawerNavView(navController: NavHostController){

}

@Composable
fun DrawerNavFooter(navController: NavHostController){

}

fun customDrawerShape(height: Float): Any {
    return object : Shape {
        override fun createOutline(
            size: androidx.compose.ui.geometry.Size,
            layoutDirection: LayoutDirection,
            density: Density
        ): Outline {
            return Outline.Rounded(
                RoundRect(
                    left = 0f,
                    top = 0f,
                    right = 900f,
                    bottom = height,
                    topRightCornerRadius = CornerRadius(x = 90f, y = 90f)
                )
            )
        }
    }
}

@Composable
fun Dp.toPx(): Float {
    val density = LocalDensity.current.density
    return this.value * density
}