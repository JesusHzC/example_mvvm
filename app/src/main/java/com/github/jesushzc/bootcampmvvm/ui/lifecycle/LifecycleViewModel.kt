package com.github.jesushzc.bootcampmvvm.ui.lifecycle

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel
import com.github.jesushzc.bootcampmvvm.utils.randomColor

class LifecycleViewModel: ViewModel() {
    var backgroundColor by mutableStateOf(Color.White)
        private set

    fun changeBackgroundColor() {
        backgroundColor = Color.randomColor()
    }

}