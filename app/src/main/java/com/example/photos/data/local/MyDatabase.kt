package com.example.photos.data.local

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [] , version = 1 , exportSchema = false)
abstract class MyDatabase : RoomDatabase() {

    abstract fun myDao() : MyDao

}

