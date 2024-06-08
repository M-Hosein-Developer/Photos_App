package com.example.photos.di.module

import com.example.photos.domain.repository.MainRepository
import com.example.photos.domain.repository.MainRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun mainRepository(mainRepositoryImpl: MainRepositoryImpl): MainRepository

}