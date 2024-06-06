package com.example.photos.domain.repository

import android.provider.Contacts
import com.example.photos.domain.model.PhotoResponse
import kotlinx.coroutines.flow.Flow

interface MainRepository {


    suspend fun getPhotos() : PhotoResponse

}