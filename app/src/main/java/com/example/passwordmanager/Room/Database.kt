package com.example.passwordmanager.Room

import androidx.room.Database
import androidx.room.Entity
import androidx.room.Query
import androidx.room.RoomDatabase


@Database(entities = [PassInfo::class], version = 1, exportSchema = false)
abstract class Database :RoomDatabase() {


    companion object{
         const val Name = "passInfoDB"
    }

    abstract fun passInfoDao() :userDao


}