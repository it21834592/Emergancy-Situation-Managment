package com.example.emergancysituationmanagment.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Emergency::class], version = 1)
 abstract class EmergencyDatabase : RoomDatabase(){
    abstract fun getEmergencyDao():EmergencyDao

    companion object{
        @Volatile
        private var INSTANCE:EmergencyDatabase?=null

        fun getInstance(context: Context):EmergencyDatabase{
            synchronized(this){
                return INSTANCE?: Room.databaseBuilder(
                    context,
                    EmergencyDatabase::class.java,
                    "Disaster_db"
                ).fallbackToDestructiveMigration().build().also {
                    INSTANCE=it
                }
            }
        }
    }

}