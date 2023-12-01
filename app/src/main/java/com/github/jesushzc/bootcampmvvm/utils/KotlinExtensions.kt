package com.github.jesushzc.bootcampmvvm.utils

import androidx.compose.ui.graphics.Color

fun Color.Companion.randomColor(): Color {
    val colors = listOf(
        Color.Red,
        Color.Green,
        Color.Blue,
        Color.Yellow,
        Color.Magenta,
        Color.Cyan
    )
    return colors.random()
}