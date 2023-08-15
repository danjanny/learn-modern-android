package com.miniproject.iseng.di.batteryimpl

import android.util.Log
import com.miniproject.iseng.di.Battery
import javax.inject.Inject

class NickelCadmiumBattery @Inject constructor() : Battery {
    override fun getPower() {
        Log.i("MYTAG", "Power from NickelCadmiumBattery")
    }
}