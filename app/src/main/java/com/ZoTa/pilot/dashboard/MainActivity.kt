package com.ZoTa.pilot.dashboard
import com.ZoTa.pilot.R

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.content.ContextCompat
import com.ZoTa.pilot.dashboard.screens.MainScreen
import com.ZoTa.pilot.ui.theme.PilotTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.statusBarColor= ContextCompat.getColor(this,R.color.grey)
        setContent {
            MainScreen(onSinglePlayerClick = {

            }
                , onBoardClick={})
        }
    }
}

