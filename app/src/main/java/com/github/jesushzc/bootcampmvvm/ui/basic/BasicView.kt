package com.github.jesushzc.bootcampmvvm.ui.basic

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun BasicView(
    viewModel: BasicViewModel = BasicViewModel()
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