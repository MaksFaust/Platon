package com.vistula.platon.ui.auth

import androidx.lifecycle.LiveData

interface AuthListener {
    fun onStarted()
    fun onSuccess(it: LiveData<String>)
    fun onFailure(message : String)
}