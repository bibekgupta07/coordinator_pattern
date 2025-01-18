package com.bibekgupta.coordinatorpatternwitheverything.ui.auth


import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.bibekgupta.coordinatorpatternwitheverything.coordinator.AppCoordinator

@Composable
fun LoginScreen(coordinator: AppCoordinator) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Button(onClick = { coordinator.navigateToMainFlow() }) {
                Text("Login")
            }
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = { coordinator.navigateToRegister() }) {
                Text("Register")
            }
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = { coordinator.navigateToForgotPassword() }) {
                Text("Forgot Password")
            }
        }
    }
}
