package com.app.viewmodelwithhit

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.app.viewmodelwithhit.databinding.ActivityLoginBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginActivity : AppCompatActivity() {
    private val viewModel: LoginViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DataBindingUtil
            .setContentView<ActivityLoginBinding>(this, R.layout.activity_login).apply {
                vm = viewModel
                this.onLoginClick = onLoginClickCallBack
            }
    }

    private val onLoginClickCallBack = { emailAddress: String? ->
        startActivity(HomeActivity.instance(this, emailAddress))
        finish()
    }
}
