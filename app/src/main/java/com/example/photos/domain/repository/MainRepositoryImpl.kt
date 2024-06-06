package com.example.photos.domain.repository

import com.example.photos.data.remote.ApiService
import com.example.photos.domain.model.PhotoResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class MainRepositoryImpl @Inject constructor(private val apiService: ApiService) : MainRepository {


    override val getPhotos: Flow<PhotoResponse> = flow {

        while (true){
            emit(apiService.getPhotos("cHrEYuOkjgsNihjYNRpvMpRQsw3PZxKY1jBGXRol3mc"))
            delay(3000)
        }

    }.flowOn(Dispatchers.IO)


}