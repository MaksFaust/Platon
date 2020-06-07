package com.vistula.platon.data.network

import android.R.attr.password
import okhttp3.*
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST
import retrofit2.http.Query


interface PlatonLoginApi {

    @POST("login")
    fun userLogin(
        @Query("service") service : String,
        @Query("username") username : String,
        @Query("password") password : String,
        @Query("lt") lt : String,
        @Query("execution") execution : String,
        @Query("_eventId") _eventId : String,
        @Query("submit") submit : String
    ) : Call<ResponseBody>

    companion object{
        operator fun invoke() : PlatonLoginApi{
            return Retrofit.Builder()
                .baseUrl("https://secure.vistula.edu.pl/cas/")
                .client(OkHttpClient.Builder().followSslRedirects(false).build())
                .build()
                .create(PlatonLoginApi::class.java)
        }
    }
}