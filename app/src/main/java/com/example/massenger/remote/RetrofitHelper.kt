package com.example.massenger.remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {
    private val retrofit: Retrofit =
        Retrofit.Builder().baseUrl("http://10.54.144.242:7088/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    val messengerApi: MessengerApi = retrofit.create(MessengerApi::class.java)
}