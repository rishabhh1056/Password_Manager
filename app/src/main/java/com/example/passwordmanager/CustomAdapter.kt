package com.example.passwordmanager

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.LiveData
import androidx.recyclerview.widget.RecyclerView
import com.example.passwordmanager.Room.PassInfo
import com.example.passwordmanager.databinding.EachItemViewBinding


class CustomAdapter(val itemList: List<PassInfo>) :RecyclerView.Adapter<CustomAdapter.myViewHolder>(){



    class myViewHolder(val binding: EachItemViewBinding): RecyclerView.ViewHolder(binding.root) {

    }


    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): myViewHolder {

        return myViewHolder(EachItemViewBinding.inflate(LayoutInflater.from(parent.context),parent, false))
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: myViewHolder, position: Int) {

        val data: PassInfo = itemList[position]

         holder.binding.apply {
             acName.text = data.accountName.toString()
             password.text = data.pass.toString()
         }
    }

}