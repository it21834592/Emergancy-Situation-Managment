package com.example.emergancysituationmanagment.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface EmergencyDao {
    @Insert
    suspend fun insert(emergency: Emergency)

    @Delete
    suspend fun delete(emergency: Emergency)

    @Query("SELECT * FROM Emergency")
    fun getAllEmergency():List<Emergency>

}