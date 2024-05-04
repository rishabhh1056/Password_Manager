package com.example.passwordmanager.viewModel

import android.app.Application
import androidx.room.Room
import com.example.passwordmanager.Room.Database

class MainApplication : Application() {

    companion object{
        lateinit var passInfoDatabase : Database
    }

    override fun onCreate() {
        super.onCreate()
       passInfoDatabase =  Room.databaseBuilder(
            applicationContext,
            Database::class.java,
            Database.Name
        ).build()

    }
}