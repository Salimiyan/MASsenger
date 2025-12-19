package com.example.massenger.remote

import com.example.massenger.model.ChannelChatResponse
import com.example.massenger.model.LastMessageResponse
import retrofit2.http.GET

interface MessengerApi {
    @GET("group-chats/all")
    suspend fun getChannelChats(): ChannelChatResponse

    @GET("messages/last/1")
    suspend fun getLastMessage(): LastMessageResponse
}