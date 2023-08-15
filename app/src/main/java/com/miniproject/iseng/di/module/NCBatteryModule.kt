package com.miniproject.iseng.di.module

import com.miniproject.iseng.di.Battery
import com.miniproject.iseng.di.batteryimpl.NickelCadmiumBattery
import dagger.Binds
import dagger.Module

@Module
abstract class NCBatteryModule {
//    @Provides
//    fun providesNCBattery(nickelCadmiumBattery: NickelCadmiumBattery): Battery {
//        return nickelCadmiumBattery
//    }

    @Binds
    abstract fun bindsNCBattery(nickelCadmiumBattery: NickelCadmiumBattery): Battery
}