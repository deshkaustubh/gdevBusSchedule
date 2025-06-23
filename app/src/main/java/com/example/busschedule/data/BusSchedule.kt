package com.example.busschedule.data

@Entity
data class BusSchedule(
    val id: Int,
    val stopName: String,
    val arrivalTimeInMillis: Int
)