package com.appynitty.taxy.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
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
import com.appynitty.taxy.screen_connection.Routes
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(navController: NavHostController){

    Column (
        modifier = Modifier.padding(20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        val username = remember { mutableStateOf(TextFieldValue()) }
        val password = remember { mutableStateOf(TextFieldValue()) }
        var passwordVisible = remember { mutableStateOf(false) }

        TextField(
            label = {
                        Text(
                            text = "Username",
                            color = Color.Gray,
                            fontSize = 14.sp
                        )
                    },
            value = username.value,
            singleLine = true,
            onValueChange = { username.value = it })

        Spacer(modifier = Modifier.height(20.dp))

        TextField(
            label = {
                Text(
                    text = "Password",
                    color = Color.Gray,
                    fontSize = 14.sp
                )
            },
            singleLine = true,
            value = password.value,
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            onValueChange = { password.value = it })

        Spacer(modifier = Modifier.height(20.dp))
        Row(
            horizontalArrangement = Arrangement.SpaceAround,
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp), verticalAlignment = Alignment.Bottom
        ) {
            Button( onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(Color.Gray)){
                Text(
                    text = "Login",
                    style = TextStyle(fontSize = 14.sp)
                )
            }
            Button( onClick = { navController.navigate(Routes.Signup.route) }, colors = ButtonDefaults.buttonColors(Color.Gray)) {
                Text(
                    text = "SignUp",
                    style = TextStyle(fontSize = 14.sp)
                )
            }
        }
        Spacer(modifier = Modifier.height(20.dp))

        ClickableText(
            text = AnnotatedString("Forget Password?"),
            onClick = { navController.navigate(Routes.ForgotPass.route)},
            style = TextStyle(
                fontSize = 14.sp,
                fontFamily = FontFamily.Default
            )
        )
        Spacer(modifier = Modifier.height(20.dp))
    }

}