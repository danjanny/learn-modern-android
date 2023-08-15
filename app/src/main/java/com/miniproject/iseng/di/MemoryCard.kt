package com.miniproject.iseng.di

import android.util.Log
import javax.inject.Inject

class MemoryCard {
    init {
        Log.i("MYTAG", "MemoryCard class constructed")
    }

    fun getSpaceAvailability() {
        Log.i("MYTAG", "MemoryCard availability")
    }
}