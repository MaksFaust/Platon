package com.vistula.platon.util

import android.content.Context
import android.util.Log
import android.widget.Toast

fun Context.toast(message: String){
    Toast.makeText(this, message, Toast.LENGTH_LONG).show()
}

fun Context.log(tag: String, message: String){
    Log.println(Log.DEBUG, tag, message)
}