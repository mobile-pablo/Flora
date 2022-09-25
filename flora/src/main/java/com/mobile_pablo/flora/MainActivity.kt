package com.mobile_pablo.flora

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.mobile_pablo.flora.ui.auth.AuthScreen
import com.mobile_pablo.uicomponents.theme.FloraTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FloraTheme {
                AuthScreen()
            }
        }
    }
}