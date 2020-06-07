package com.vistula.platon.ui.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.vistula.platon.R
import com.vistula.platon.databinding.ActivityLoginBindingImpl
import com.vistula.platon.util.toast

class LoginActivity : AppCompatActivity(), AuthListener {


    private lateinit var binding: ActivityLoginBindingImpl
    private lateinit var viewModel: AuthViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_login)
        viewModel = ViewModelProvider(this).get(AuthViewModel::class.java)
        binding.setViewmodel(viewModel)
        viewModel.authListener = this
    }

    override fun onStarted() {
        toast("Login Started")
    }

    override fun onSuccess(it: LiveData<String>) {
        it.observe(this, Observer { Log.println(Log.DEBUG, "mamma", it)})
    }

    override fun onFailure(message: String) {
        toast(message)
    }
}
