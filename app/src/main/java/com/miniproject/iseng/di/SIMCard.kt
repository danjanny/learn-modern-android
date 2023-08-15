package com.miniproject.iseng.di

import android.util.Log
import javax.inject.Inject

class SIMCard @Inject constructor(val serviceProvider: ServiceProvider) {
    init {
        Log.i("MYTAG", "SIMCard class constructed")
    }

    fun getConnection() {
        serviceProvider.getServiceProvider()
    }
}