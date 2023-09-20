package com.appynitty.taxy.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignupScreen(navController: NavHostController){

    val state = rememberScrollState()
    LaunchedEffect(Unit) { state.animateScrollTo(100) }

    Scaffold(
        topBar = {
            CustomToolbarScreen(navController = navController, title = "Signup", true)
        }
    )
    { innerPadding ->
        Column (
            modifier = Modifier.padding(innerPadding).verticalScroll(state)
                .padding(20.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            val fullName = remember { mutableStateOf(TextFieldValue()) }
            val contact = remember { mutableStateOf(TextFieldValue()) }
            val emailId = remember { mutableStateOf(TextFieldValue()) }
            val address = remember { mutableStateOf(TextFieldValue()) }
            val password = remember { mutableStateOf(TextFieldValue()) }
            val confirmPassword = remember { mutableStateOf(TextFieldValue()) }
            var passwordVisible = remember { mutableStateOf(false) }

            TextField(
                label = {
                    Text(
                        text = "Full Name",
                        color = Color.Gray,
                        fontSize = 14.sp
                    )
                },
                value = fullName.value,
                singleLine = true,
                onValueChange = { fullName.value = it }
            )
            Spacer(modifier = Modifier
                .height(10.dp)
                .width(10.dp))
            TextField(
                label = {
                    Text(
                        text = "Contact",
                        color = Color.Gray,
                        fontSize = 14.sp
                    )
                },
                value = contact.value,
                singleLine = true,
                keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number),
                onValueChange = { contact.value = it }
            )
            Spacer(modifier = Modifier
                .height(20.dp))

            TextField(
                label = {
                    Text(
                        text = "Email Id",
                        color = Color.Gray,
                        fontSize = 14.sp
                    )
                },
                value = emailId.value,
                singleLine = true,
                keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Email),
                onValueChange = { emailId.value = it }
            )
            Spacer(modifier = Modifier.height(10.dp))

            TextField(
                label = {
                    Text(
                        text = "Address",
                        color = Color.Gray,
                        fontSize = 14.sp
                    )
                },
                value = address.value,
                singleLine = true,
                keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Text),
                onValueChange = { address.value = it }
            )
            Spacer(modifier = Modifier.height(10.dp))
            TextField(
                label = {
                    Text(
                        text = "Password",
                        color = Color.Gray,
                        fontSize = 14.sp
                    )
                },
                value = password.value,
                singleLine = true,
                keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Password),
                visualTransformation =  PasswordVisualTransformation(),
                onValueChange = { password.value = it }
            )
            Spacer(modifier = Modifier.height(10.dp))
            TextField(
                label = {
                    Text(
                        text = "Confirm Password",
                        color = Color.Gray,
                        fontSize = 14.sp
                    )
                },
                value = confirmPassword.value,
                singleLine = true,
                keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Password),
                visualTransformation =  PasswordVisualTransformation(),//password mark in dot sign
                onValueChange = { confirmPassword.value = it }
            )
            Spacer(modifier = Modifier.height(10.dp))

            Box (modifier = Modifier.fillMaxWidth(),
                Alignment.Center){
                Button( onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(Color.Gray)){
                    Text(
                        text = "Submit",
                        style = TextStyle(fontSize = 14.sp)
                    )
                }
            }

            ClickableText(
                text = AnnotatedString("If account already exist, then Login"),
                onClick = { },
                style = TextStyle(
                    fontSize = 14.sp,
                    fontFamily = FontFamily.Default
                )
            )
            Spacer(modifier = Modifier.height(20.dp))
        }
    }
}