package com.github.jesushzc.bootcampmvvm.ui.basic

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import com.github.jesushzc.bootcampmvvm.utils.randomColor

class BasicViewModel {
    var backgroundColor by mutableStateOf(Color.White)
        private set

    fun changeBackgroundColor() {
        backgroundColor = Color.randomColor()
    }

}