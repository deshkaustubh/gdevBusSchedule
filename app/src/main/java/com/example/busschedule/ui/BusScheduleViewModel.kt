/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.busschedule.ui

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.busschedule.data.AppDatabase
import com.example.busschedule.data.BusSchedule
import com.example.busschedule.data.BusScheduleDao
import kotlinx.coroutines.flow.Flow


class BusScheduleViewModel(private val busScheduleDao: BusScheduleDao) : ViewModel() {

    // Get example bus schedule
    fun getFullSchedule(): Flow<List<BusSchedule>> = busScheduleDao.getFullBusSchedule()


    // Get example bus schedule by stop
    fun getScheduleFor(stopName: String): Flow<List<BusSchedule>> =
        busScheduleDao.getScheduleForStopName(stopName)

    companion object {
        val factory: ViewModelProvider.Factory = viewModelFactory {
            initializer {
                val application = (this[APPLICATION_KEY] as Application)
                val database = AppDatabase.getDatabase(application)
                BusScheduleViewModel(database.busScheduleDao())
            }
        }
    }
}
