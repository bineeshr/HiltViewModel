package com.app.viewmodelwithhit

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.app.viewmodelwithhit.databinding.ActivityHomeBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeActivity : AppCompatActivity() {
    private val viewModel: HomeViewModel by viewModels()

    companion object {
        const val EMAIL_ADDRESS = "email_address"
        fun instance(context: Context, email: String?): Intent {
            return Intent(context, HomeActivity::class.java).apply {
                putExtra(EMAIL_ADDRESS, email)
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DataBindingUtil
            .setContentView<ActivityHomeBinding>(this, R.layout.activity_home).apply {
                vm = viewModel
            }

    }

}
