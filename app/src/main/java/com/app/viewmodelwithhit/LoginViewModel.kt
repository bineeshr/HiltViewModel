package com.app.viewmodelwithhit

import androidx.databinding.ObservableField
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel

class LoginViewModel @ViewModelInject constructor() : ViewModel() {
    val emailAddress = ObservableField<String>()
    val password = ObservableField<String>()
}
