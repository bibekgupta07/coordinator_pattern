package com.bibekgupta.coordinatorpatternwitheverything

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.bibekgupta.coordinatorpatternwitheverything.coordinator.AppCoordinator
import com.bibekgupta.coordinatorpatternwitheverything.navigation.NavGraph

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            val coordinator = AppCoordinator(navController)
            NavGraph(coordinator)
        }
    }
}

