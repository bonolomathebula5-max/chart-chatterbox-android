package com.chatchatterbox.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import com.chatchatterbox.app.ui.screens.ChartChatterboxApp
import com.chatchatterbox.app.ui.theme.ChartChatterboxTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ChartChatterboxTheme {
                Surface(color = MaterialTheme.colorScheme.background) {
                    ChartChatterboxApp()
                }
            }
        }
    }
}
