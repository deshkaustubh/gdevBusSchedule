package com.example.busschedule.data

import androidx.room.Dao
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface BusScheduleDao {
    @Query("SELECT * FROM busschedule ORDER BY arrivalTimeInMillis ASC")
    fun getFullBusSchedule(): Flow<List<BusSchedule>>

    @Query("SELECT * FROM busschedule WHERE stopName = :stopName ")
    fun getScheduleForStopName(stopName: String): Flow<List<BusSchedule>>
}