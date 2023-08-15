package com.miniproject.iseng.di

import com.miniproject.iseng.MainActivity
import com.miniproject.iseng.di.module.MemoryCardModule
import com.miniproject.iseng.di.module.NCBatteryModule
import dagger.Component

@Component(modules = [MemoryCardModule::class, NCBatteryModule::class])
interface SmartPhoneComponent {
//    fun getSmartPhone(): SmartPhone

    fun inject(mainActivity: MainActivity)
}