@file:Suppress("PreviewAnnotationInFunctionWithParameters")

package com.appynitty.taxy.screen

import android.content.Context
import androidx.compose.foundation.rememberScrollState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController

@Preview()
@Composable
fun ForgotPasswordScreen(navController: NavHostController){
    val context: Context;
    val state = rememberScrollState()

    LaunchedEffect(Unit) { state.animateScrollTo(100) }

    CustomToolbarScreen(navController, title = "Forgot Password")

}