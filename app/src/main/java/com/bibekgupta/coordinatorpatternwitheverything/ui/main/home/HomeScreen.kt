package com.bibekgupta.coordinatorpatternwitheverything.ui.main.home

import androidx.activity.compose.BackHandler
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.bibekgupta.coordinatorpatternwitheverything.navigation.NavRoutes
import com.bibekgupta.coordinatorpatternwitheverything.coordinator.AppCoordinator

@Composable
fun HomeScreen(coordinator: AppCoordinator) {

//    val navController = coordinator.navController
//
//    BackHandler {
//        val currentRoute = navController.currentBackStackEntry?.destination?.route
//        if (currentRoute == NavRoutes.HOME) {
//            // Close the app if on Home screen
//            System.exit(0)  // Or use Activity.finish() to close the app
//        } else {
//            // Navigate back to the previous screen if not on Home screen
//            coordinator.navigateBack()
//        }
//    }

    Text("Home Screen")
}