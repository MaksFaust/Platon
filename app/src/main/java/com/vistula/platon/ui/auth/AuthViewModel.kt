package com.vistula.platon.ui.auth

import android.util.Log
import android.view.View
import androidx.lifecycle.ViewModel
import com.vistula.platon.data.repositories.UserRepository

class AuthViewModel : ViewModel(){
    var login : String? = null
    var password : String? = null

    var authListener : AuthListener? = null

    fun onSignInButtonClick(view : View){
        authListener?.onStarted()


        if(login.isNullOrEmpty() || password.isNullOrEmpty()){
            authListener?.onFailure("Invalid email or password")
            return;
        }

        val loginResponse = UserRepository().userLogin(login!!, password!!)
        authListener?.onSuccess(loginResponse)
    }
}