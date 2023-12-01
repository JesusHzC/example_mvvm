package com.github.jesushzc.bootcampmvvm.ui.lifecycle

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun LifecycleView(
    viewModel: LifecycleViewModel = viewModel()
) {
    Surface(
        color = viewModel.backgroundColor,
        modifier = Modifier.fillMaxSize()
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Button(onClick = { viewModel.changeBackgroundColor() }) {
                Text(text = "Change color")
            }
        }
    }
}