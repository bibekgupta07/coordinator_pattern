package com.bibekgupta.coordinatorpatternwitheverything.ui.main.home


import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.bibekgupta.coordinatorpatternwitheverything.coordinator.AppCoordinator
import com.bibekgupta.coordinatorpatternwitheverything.navigation.NavRoutes

@Composable
fun HomeScreen(coordinator: AppCoordinator) {
    val items = listOf("Item1", "Item2", "Item3")

    Column {
        items.forEach { item ->
            Button(onClick = {
                coordinator.navigateTo("${NavRoutes.HOME}/$item")
            }) {
                Text("Go to $item Detail")
            }
        }
    }
}
