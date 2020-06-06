package com.vistula.platon.data.network

import android.util.Log
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Scheduler
import io.reactivex.rxjava3.core.Single
import io.reactivex.rxjava3.core.SingleOnSubscribe
import io.reactivex.rxjava3.schedulers.Schedulers
import okhttp3.*
import java.io.IOException
import java.util.function.Supplier


class CasClient {
    val TAG_LT = "name=\"lt\" value="
    val TAG_EXECUTION = "name=\"execution\" value="
    val TAG_EVENTID = "name=\"_eventId\" value=\""
    val TAG_SERVICE = "?service="

    companion object{
        @JvmStatic private var body : String? = null
    }

    fun getBody() : Boolean{
        val client = OkHttpClient()
        val request : Request = Request.Builder()
            .url("https://platon.vistula.edu.pl/LogowanieCas")
            .build()
        val response = client.newCall(request).execute()
        if(response.isSuccessful){
            body = response.body()?.string()
            return true
        }
        body = response.message()
        return false
    }

    fun getService() : String{
        return cutOff(TAG_SERVICE, "", "&")
    }

    fun getLT() : String{
        return cutOff(TAG_LT, "\"", "\"")
    }

    fun getExecution() : String{
        return cutOff(TAG_EXECUTION, "\"", "\"")
    }

    fun getEventId() : String{
        return cutOff(TAG_EVENTID,"\"", "\"")
    }

    fun getSubmit() : String{
        return "LOGIN"
    }

    private fun cutOff(str:String, prefix : String, sufix : String):String{
        val i = body!!.indexOf(str, 0, false) + str.length
        var s : String = body!!.substring(i, i+100)
        s = s.removePrefix(prefix)
        s = s.removeRange(s.indexOf(sufix), s.length)
        return s.trim()
    }


}