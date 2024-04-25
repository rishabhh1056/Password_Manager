package com.example.passwordmanager

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class CustomAdapter(context: Context, private val data: List<String>) : ArrayAdapter<String>(context, R.layout.each_item_view, data) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var itemView = convertView
        if (itemView == null) {
            itemView = LayoutInflater.from(context).inflate(R.layout.each_item_view, parent, false)
        }

        val textViewItem = itemView!!.findViewById<TextView>(R.id.acName)
        val textViewItem2 = itemView.findViewById<TextView>(R.id.password)
        textViewItem.text = data[position]
        textViewItem2.text = data[position]

        return itemView
    }
}