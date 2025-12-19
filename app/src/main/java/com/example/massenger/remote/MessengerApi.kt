package com.example.massenger.remote

import com.example.massenger.model.ChannelChatResponse
import retrofit2.http.GET

interface MessengerApi {
    @GET("group-chats/all")
    suspend fun getChannelChats(): ChannelChatResponse
}