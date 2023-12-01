package com.github.jesushzc.bootcampmvvm.ui.events

sealed class EventAction {
    object ChangeBackgroundColor: EventAction()
    data class ChangeEmail(val email: String): EventAction()
    data class ChangePassword(val password: String): EventAction()
}
