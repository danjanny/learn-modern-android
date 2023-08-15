package com.miniproject.iseng.di

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class SmartPhone @Inject constructor(
    val battery: Battery,
    val memoryCard: MemoryCard,
    val simCard: SIMCard
) {
    init {
        battery.getPower()
        memoryCard.getSpaceAvailability()
        simCard.getConnection()
    }

    fun makeACallWithRecording() {
        Log.i("MYTAG", "calling ....")
    }
}