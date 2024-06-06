package com.example.photos.di.module

import android.content.Context
import androidx.room.Room
import com.example.photos.data.local.MyDao
import com.example.photos.data.local.MyDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context): MyDatabase = Room
        .databaseBuilder(context , MyDatabase::class.java , "my_database")
         .fallbackToDestructiveMigration()
        .build()


    @Provides
    @Singleton
    fun provideDao(myDatabase: MyDatabase) : MyDao = myDatabase.myDao()


}