package com.bibekgupta.coordinatorpatternwitheverything.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.bibekgupta.coordinatorpatternwitheverything.coordinator.AppCoordinator
import com.bibekgupta.coordinatorpatternwitheverything.ui.auth.ForgotPasswordScreen
import com.bibekgupta.coordinatorpatternwitheverything.ui.auth.LoginScreen
import com.bibekgupta.coordinatorpatternwitheverything.ui.auth.RegisterScreen
import com.bibekgupta.coordinatorpatternwitheverything.ui.main.add.AddScreen
import com.bibekgupta.coordinatorpatternwitheverything.ui.main.home.HomeScreen
import com.bibekgupta.coordinatorpatternwitheverything.ui.main.notifications.NotificationsScreen
import com.bibekgupta.coordinatorpatternwitheverything.ui.main.profile.ProfileScreen
import com.bibekgupta.coordinatorpatternwitheverything.ui.main.search.SearchScreen
import com.bibekgupta.coordinatorpatternwitheverything.ui.splash.SplashScreen
import androidx.navigation.navigation
import com.bibekgupta.coordinatorpatternwitheverything.ui.main.home.HomeDetailScreen


@Composable
fun NavGraph(coordinator: AppCoordinator) {
    NavHost(
        navController = coordinator.navController,
        startDestination = NavRoutes.SPLASH
    ) {
        composable(NavRoutes.SPLASH) {
            SplashScreen(coordinator)
        }

        navigation(
            startDestination = NavRoutes.LOGIN,
            route = NavRoutes.AUTH_FLOW
        ) {
            composable(NavRoutes.LOGIN) {
                LoginScreen(coordinator)
            }
            composable(NavRoutes.REGISTER) {
                RegisterScreen(coordinator)
            }
            composable(NavRoutes.FORGOT_PASSWORD) {
                ForgotPasswordScreen(coordinator)
            }
        }

        navigation(
            startDestination = NavRoutes.HOME,
            route = NavRoutes.MAIN_FLOW
        ) {
            // Home Screen
            composable(NavRoutes.HOME) {
                MainScreenWithBottomBar(coordinator) {
                    HomeScreen(coordinator)
                }
            }
            // Detail Screen, nested under Home
            composable("${NavRoutes.HOME}/{itemId}") { backStackEntry ->
                val itemId = backStackEntry.arguments?.getString("itemId")
                MainScreenWithBottomBar(coordinator) {
                    // Pass the itemId to the DetailScreen
                    HomeDetailScreen(coordinator, itemId)
                }
            }

            // Search Screen
            composable(NavRoutes.SEARCH) {
                MainScreenWithBottomBar(coordinator) {
                    SearchScreen(coordinator)
                }
            }
            // Profile Screen
            composable(NavRoutes.PROFILE) {
                MainScreenWithBottomBar(coordinator) {
                    ProfileScreen(coordinator)
                }
            }
            // Notifications Screen
            composable(NavRoutes.NOTIFICATIONS) {
                MainScreenWithBottomBar(coordinator) {
                    NotificationsScreen(coordinator)
                }
            }
            // Add Screen
            composable(NavRoutes.ADD) {
                MainScreenWithBottomBar(coordinator) {
                    AddScreen(coordinator)
                }
            }

        }
    }
}



