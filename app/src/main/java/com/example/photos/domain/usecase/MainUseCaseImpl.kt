package com.example.photos.domain.usecase

import com.example.photos.domain.model.PhotoResponse
import com.example.photos.domain.repository.MainRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class MainUseCaseImpl @Inject constructor(private val mainRepository: MainRepository) : MainUseCase {

    override suspend fun getPhotos(): PhotoResponse = mainRepository.getPhotos()

}