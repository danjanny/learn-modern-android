package com.miniproject.iseng.di.module

import android.util.Log
import com.miniproject.iseng.di.MemoryCard
import dagger.Component
import dagger.Module
import dagger.Provides

@Module
class MemoryCardModule(val memorySize: Int) {

    @Provides
    fun provideMemoryCard(): MemoryCard {
        Log.i("MYTAG", "Size of the memory is $memorySize")
        return MemoryCard()
    }
}