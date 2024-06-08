package com.example.photos.di.module

import com.example.photos.domain.usecase.MainUseCase
import com.example.photos.domain.usecase.MainUseCaseImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class UseCaseModule {

    @Binds
    abstract fun mainUseCase(mainUseCaseImpl: MainUseCaseImpl): MainUseCase

}