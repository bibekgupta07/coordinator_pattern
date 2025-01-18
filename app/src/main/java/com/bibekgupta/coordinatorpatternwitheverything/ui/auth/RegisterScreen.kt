package com.bibekgupta.coordinatorpatternwitheverything.ui.auth


import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.bibekgupta.coordinatorpatternwitheverything.coordinator.AppCoordinator

@Composable
fun RegisterScreen(coordinator: AppCoordinator) {
    Button(onClick = { coordinator.navigateToLogin() }) {
        Text("Back to Login")
    }
    Text("Register Screen")
}