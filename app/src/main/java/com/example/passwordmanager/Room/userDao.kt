package com.example.passwordmanager.Room

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Entity
import androidx.room.Insert
import androidx.room.Query

@Dao
interface userDao {


    @Query("SELECT * FROM pass_info")
   fun getAllPassInfo(): LiveData<List<PassInfo>>

            @Insert
  suspend  fun addPassInfo(entity: PassInfo)

    @Query("DELETE FROM pass_info WHERE id =:id")
   suspend fun deletePassInfo(id : Int)

//    @Query("UPDATE  FROM ")
//    fun editPassInfo()


}