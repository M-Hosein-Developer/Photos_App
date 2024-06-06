package com.example.photos.domain.usecase

import com.example.photos.domain.model.PhotoResponse
import kotlinx.coroutines.flow.Flow

interface MainUseCase {

    suspend fun getPhotos() : PhotoResponse

}