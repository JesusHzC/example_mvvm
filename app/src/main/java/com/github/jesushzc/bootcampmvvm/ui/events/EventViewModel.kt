package com.github.jesushzc.bootcampmvvm.ui.events

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel
import com.github.jesushzc.bootcampmvvm.model.UiModel
import com.github.jesushzc.bootcampmvvm.utils.randomColor

class EventViewModel: ViewModel() {
    var model by mutableStateOf(UiModel())
        private set

    fun onAction(action: EventAction) {
        model = when (action) {
            EventAction.ChangeBackgroundColor -> {
                model.copy(backgroundColor = Color.randomColor())
            }
            is EventAction.ChangeEmail -> {
                model.copy(email = action.email)
            }

            is EventAction.ChangePassword -> {
                model.copy(password = action.password)
            }
        }
    }

}