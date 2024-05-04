package com.example.passwordmanager.Room

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "pass_info")
data class PassInfo(
    @PrimaryKey(autoGenerate = true)
    val id: Int? = 0,
    val accountName: String? = null,
    val userName: String? = null,
    val pass: String? = null
)

