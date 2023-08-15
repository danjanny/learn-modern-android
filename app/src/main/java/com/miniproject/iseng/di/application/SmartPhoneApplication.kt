package com.miniproject.iseng.di.application

import android.app.Application
import com.miniproject.iseng.di.DaggerSmartPhoneComponent
import com.miniproject.iseng.di.SmartPhoneComponent
import com.miniproject.iseng.di.module.MemoryCardModule

class SmartPhoneApplication : Application() {

    lateinit var smartPhoneComponent: SmartPhoneComponent

    override fun onCreate() {
        smartPhoneComponent = initDagger()
        super.onCreate()
    }

    private fun initDagger(): SmartPhoneComponent =
        DaggerSmartPhoneComponent.builder().memoryCardModule(MemoryCardModule(2500)).build()

}