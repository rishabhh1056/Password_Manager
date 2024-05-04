package com.example.passwordmanager.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.passwordmanager.Room.PassInfo

class myViewModel : ViewModel() {

   val passInfoDao = MainApplication.passInfoDatabase.passInfoDao()

    val passwordManager : LiveData<List<PassInfo>> = passInfoDao.getAllPassInfo()



    suspend fun addPassInfo(AcName :String, userName:String, pasword:String)
    {
        passInfoDao.addPassInfo(PassInfo(accountName = AcName, userName = userName, pass = pasword))
    }

    suspend fun deletePassInfo(id:Int){
       passInfoDao.deletePassInfo(id)
    }

}