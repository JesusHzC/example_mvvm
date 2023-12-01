package com.github.jesushzc.bootcampmvvm.ui.events

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EventView(
    viewModel: EventViewModel = viewModel()
) {
    Surface(
        color = viewModel.model.backgroundColor,
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(onClick = { viewModel.onAction(EventAction.ChangeBackgroundColor) }) {
                Text(text = "Change color")
            }
            OutlinedTextField(
                value = viewModel.model.email,
                onValueChange = { viewModel.onAction(EventAction.ChangeEmail(it)) },
                label = { Text(text = "Email") }
            )
            OutlinedTextField(
                value = viewModel.model.password,
                onValueChange = { viewModel.onAction(EventAction.ChangePassword(it)) },
                label = { Text(text = "Password") }
            )
        }
    }
}