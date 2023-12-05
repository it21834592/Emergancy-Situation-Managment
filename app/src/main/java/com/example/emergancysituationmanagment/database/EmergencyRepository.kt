package com.example.emergancysituationmanagment.database

class EmergencyRepository (private val db:EmergencyDatabase) {
    suspend fun insert(emergency: Emergency) = db.getEmergencyDao().insert(emergency)
    suspend fun delete(emergency: Emergency) = db.getEmergencyDao().delete(emergency)

    fun getAllEmergency(): List<Emergency> = db.getEmergencyDao().getAllEmergency()
}