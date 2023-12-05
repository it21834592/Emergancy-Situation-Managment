package com.example.emergancysituationmanagment.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Emergency(var title:String?,
                     var district:String?,
                     var dis:String?,
                     var photoPath:String?,
) {
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null
}