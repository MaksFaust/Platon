package com.vistula.platon.data.network

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface PlatonLoginApi {

    @FormUrlEncoded
    @POST ("login/")
    fun userLogin(
        @Field("service") service : String,
        @Field("username") username : String,
        @Field("password") password : String,
        @Field("lt") lt : String,
        @Field("execution") execution : String,
        @Field("_eventId") _eventId : String,
        @Field("submit") submit : String
    ) : Call<ResponseBody>

    companion object{
        operator fun invoke() : PlatonLoginApi{
            return Retrofit.Builder()
                .baseUrl("https://secure.vistula.edu.pl/cas/")
                .build()
                .create(PlatonLoginApi::class.java)
        }
    }
}