package com.example.massenger.remote

import com.example.massenger.model.ChannelChat
import retrofit2.http.GET

interface MessengerApi {
    @GET("ChannelChat")
    suspend fun getChannelChats(): List<ChannelChat>
}