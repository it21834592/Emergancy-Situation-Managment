package com.example.emergancysituationmanagment

import android.net.Uri
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.emergancysituationmanagment.database.Emergency

class EmergencyViewHolder (view: View): RecyclerView.ViewHolder(view) {
    val DImage: ImageView = view.findViewById(R.id.DImage)
    val Dtitle: TextView = view.findViewById(R.id.Dtitle)
    val DDistrict: TextView = view.findViewById(R.id.DDistrict)
    val DDis: TextView = view.findViewById(R.id.DDis)

    fun bind(emergency: Emergency) {
        Dtitle.text = emergency.title
        DDistrict.text = emergency.district
        DDis.text = emergency.dis


        // Load and display the image using Glide
        emergency.photoPath?.let { path ->
            Glide.with(DImage.context)
                .load(Uri.parse(path)) // Assuming the photoPath is a valid URI
                .into(DImage)
        }
    }
}