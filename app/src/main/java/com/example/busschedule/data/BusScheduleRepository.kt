package com.example.busschedule.data

import kotlinx.coroutines.flow.Flow

class BusScheduleRepository(private val busScheduleDao: BusScheduleDao) {

    fun getFullSchedule(): Flow<List<BusSchedule>> =
        busScheduleDao.getFullBusSchedule()

    fun getScheduleFor(stopName: String): Flow<List<BusSchedule>> =
        busScheduleDao.getScheduleForStopName(stopName)
}