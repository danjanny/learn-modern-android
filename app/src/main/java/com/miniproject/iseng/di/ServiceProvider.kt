package com.miniproject.iseng.di

import android.util.Log
import javax.inject.Inject

class ServiceProvider @Inject constructor() {
    init {
        Log.i("MYTAG", "ServiceProvider constructed")
    }

    fun getServiceProvider() {
        Log.i("MYTAG", "Get service provider")
    }
}