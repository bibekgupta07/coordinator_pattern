package com.bibekgupta.coordinatorpatternwitheverything.ui.main.home

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.bibekgupta.coordinatorpatternwitheverything.coordinator.AppCoordinator




@Composable
fun HomeDetailScreen(coordinator: AppCoordinator, itemId: String?) {
    Column {
        Text("Detail Screen for item: $itemId")

        Button(onClick = {
            coordinator.navigateBack()
        }) {
            Text("Go Back")
        }
    }
}
