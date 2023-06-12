package com.android.activity11

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.activity11.ui.model.UserData

class UserAdapter(val c:Context,val itemList:ArrayList<UserData>):RecyclerView.Adapter<UserAdapter.UserViewHolder>(){
    inner class UserViewHolder(val v: View): RecyclerView.ViewHolder(v) {
        val name = v.findViewById<TextView>(R.id.mTitle)
        val quan = v.findViewById<TextView>(R.id.mSubTitle)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val v = inflater.inflate(R.layout.list_items,parent,false)
        return UserViewHolder(v)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val newList = itemList[position]
        holder.name.text = newList.itemName
        holder.quan.text = newList.quantity.toString()
    }
}