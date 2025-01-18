package com.bibekgupta.coordinatorpatternwitheverything.coordinator

interface Coordinator {
    fun navigateToAuthFlow()
    fun navigateToMainFlow()
    fun navigateToLogin()
    fun navigateToRegister()
    fun navigateToForgotPassword()
    fun navigateToHome()
    fun navigateToSearch()
    fun navigateToProfile()
    fun navigateToNotifications()
    fun navigateToAdd()
    fun navigateTo(route: String)
    fun navigateBack(): Boolean
    fun navigateUp(): Boolean
}