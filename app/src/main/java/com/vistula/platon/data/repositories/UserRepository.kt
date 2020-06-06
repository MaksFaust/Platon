package com.vistula.platon.data.repositories

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.vistula.platon.data.network.CasClient
import com.vistula.platon.data.network.PlatonLoginApi
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Single
import io.reactivex.rxjava3.core.SingleOnSubscribe
import io.reactivex.rxjava3.schedulers.Schedulers
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Response
import retrofit2.Callback

class UserRepository {
    fun userLogin(username : String, password : String) : LiveData<String>{

        val loginResponse = MutableLiveData<String>()
        Single.create(SingleOnSubscribe<Boolean>{ emitter -> emitter.onSuccess(CasClient().getBody()) })
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe{it ->

            if(it){
                PlatonLoginApi().userLogin(CasClient().getService(), username, password, CasClient().getLT(), CasClient().getExecution(), CasClient().getEventId(), CasClient().getSubmit())
                    .enqueue(object : Callback<ResponseBody>{
                        override fun onFailure(call: Call<ResponseBody>, t: Throwable) {
                            loginResponse.value = t.message
                        }

                        override fun onResponse(
                            call: Call<ResponseBody>,
                            response: Response<ResponseBody>
                        ) {
                            if(response.isSuccessful)
                                loginResponse.value = response.body()?.string()
                            else
                                loginResponse.value = response.errorBody()?.string()
                        }

                    })}
            else {
                Log.println(Log.DEBUG, "mamma", "Suka")}}

        return loginResponse
    }
}