package com.appynitty.taxy.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.appynitty.taxy.screen.CustomToolbarScreen
import com.appynitty.taxy.screen.DashboardScreen
import com.appynitty.taxy.screen.ForgotPasswordScreen
import com.appynitty.taxy.screen.LoginScreen
import com.appynitty.taxy.navigateApp.Navigation
import com.appynitty.taxy.navigation_connection.DrawerNavComplete
import com.appynitty.taxy.navigation_connection.DrawerNavHeader
import com.appynitty.taxy.screen.SignupScreen
import com.appynitty.taxy.screen.SplashScreen
import com.appynitty.taxy.showModel.CreditCardViewModel
import com.appynitty.taxy.ui.theme.TaxyTheme

class MainActivity : ComponentActivity() {
    private val viewModel: CreditCardViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaxyTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //Greeting("Android")
                    Navigation()
                }
            }
        }
    }

    @Composable
    fun Greeting(name: String) {
        Text(text = "Hello $name!")
    }

    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
        TaxyTheme {
            Navigation()
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun SplashPreview() {
        TaxyTheme {
            val navController = rememberNavController()
            SplashScreen(navController = navController )
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun SignUpPreview() {
        TaxyTheme {
            val navController = rememberNavController()
            SignupScreen(navController = navController)
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun LoginPreview() {
        TaxyTheme {
            val navController = rememberNavController()
            LoginScreen(navController = navController)
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun ForgotPassPreview() {
        TaxyTheme {
            val navController = rememberNavController()
            ForgotPasswordScreen(navController = navController)
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun CustomToolbarPreview() {
        TaxyTheme {
            val navController = rememberNavController()
            CustomToolbarScreen(navController = navController, title = String(),true)
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun DashboardPreview() {
        TaxyTheme {
            val navController = rememberNavController()
            DashboardScreen(navController = navController)
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun DrawerNavCompletePreview() {
        TaxyTheme {
            val navController = rememberNavController()
        }
    }
}
