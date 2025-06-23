package com.example.busschedule.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class BusSchedule(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 100,
    val stopName: String,
    val arrivalTimeInMillis: Int
)