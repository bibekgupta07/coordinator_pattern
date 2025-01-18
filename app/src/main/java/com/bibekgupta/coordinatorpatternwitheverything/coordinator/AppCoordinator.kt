package com.bibekgupta.coordinatorpatternwitheverything.coordinator

import androidx.navigation.NavHostController
import com.bibekgupta.coordinatorpatternwitheverything.navigation.NavRoutes

class AppCoordinator(
    val navController: NavHostController
) : Coordinator {

    override fun navigateTo(route: String) {
        navController.navigate(route) {
            launchSingleTop = true
        }
    }


    override fun navigateToAuthFlow() = navigateTo(NavRoutes.AUTH_FLOW)
    override fun navigateToMainFlow() = navigateTo(NavRoutes.MAIN_FLOW)
    override fun navigateToLogin() = navigateTo(NavRoutes.LOGIN)
    override fun navigateToRegister() = navigateTo(NavRoutes.REGISTER)
    override fun navigateToForgotPassword() = navigateTo(NavRoutes.FORGOT_PASSWORD)
    override fun navigateToHome() = navigateTo(NavRoutes.HOME)
    override fun navigateToSearch() = navigateTo(NavRoutes.SEARCH)
    override fun navigateToProfile() = navigateTo(NavRoutes.PROFILE)
    override fun navigateToNotifications() = navigateTo(NavRoutes.NOTIFICATIONS)
    override fun navigateToAdd() = navigateTo(NavRoutes.ADD)
    override fun navigateBack() = navController.popBackStack()
    override fun navigateUp(): Boolean = navController.navigateUp()
}



