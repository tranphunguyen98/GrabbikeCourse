package com.tranphunguyen.mvvm.View

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.tranphunguyen.mvvm.R
import com.tranphunguyen.mvvm.viewModel.LoginViewModel
import com.tranphunguyen.mvvm.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val activityLoginBinding = DataBindingUtil.setContentView<ActivityLoginBinding>(this, R.layout.activity_login)
        val loginViewModel = LoginViewModel(this)

        activityLoginBinding.loginViewModel = loginViewModel
    }
}
