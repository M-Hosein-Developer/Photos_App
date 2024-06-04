package com.example.photos.data.remote

import com.example.photos.domain.model.PhotoResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("photos/")
    suspend fun getPhotos(@Query("client_id") clientId: String): PhotoResponse

}