package com.example.emergancysituationmanagment

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.emergancysituationmanagment.database.Emergency
import com.example.emergancysituationmanagment.database.EmergencyRepository

class EmergencyAdapter (items:List<Emergency>, repository: EmergencyRepository, viewMode:MainActivityData):
    RecyclerView.Adapter<EmergencyViewHolder>(){
    lateinit var  context: Context

    val items =items
    val repository=repository
    val viewModel=viewMode

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmergencyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.viewemergency,parent,false)
        return EmergencyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: EmergencyViewHolder, position: Int) {
        val disaster = items[position]
        holder.Dtitle.text = disaster.title
        holder.DDistrict.text = disaster.district
        holder.DDis.text = disaster.dis
        holder.DImage


    }
}