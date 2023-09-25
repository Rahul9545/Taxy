package com.appynitty.taxy.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.appynitty.taxy.R

@Composable
fun SettingScreen(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.LightGray)
            .wrapContentSize(Alignment.Center)
    ) {
        Text(
            text = "Setting Screen",
            fontWeight = FontWeight.Bold,
            color = Color.Yellow,
            modifier = Modifier.align(Alignment.CenterHorizontally),
            textAlign = TextAlign.Center,
            fontSize = 20.sp
        )
    }
}