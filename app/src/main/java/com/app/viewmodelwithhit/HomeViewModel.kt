package com.app.viewmodelwithhit

import androidx.hilt.Assisted
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.app.viewmodelwithhit.HomeActivity.Companion.EMAIL_ADDRESS

class HomeViewModel
@ViewModelInject constructor(@Assisted private val savedStateHandle: SavedStateHandle) :
    ViewModel() {
    val emailAddress = savedStateHandle.get<String>(EMAIL_ADDRESS)
}
