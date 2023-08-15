package com.miniproject.iseng

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.miniproject.iseng.di.DaggerSmartPhoneComponent
import com.miniproject.iseng.di.SmartPhone
import com.miniproject.iseng.di.application.SmartPhoneApplication
import com.miniproject.iseng.di.module.MemoryCardModule
import javax.inject.Inject


class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var smartPhone: SmartPhone

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        (application as SmartPhoneApplication).smartPhoneComponent.inject(this)
        smartPhone.makeACallWithRecording()

//        DaggerSmartPhoneComponent.create().inject(this)
//        smartPhone.makeACallWithRecording()

//        DaggerSmartPhoneComponent
//            .builder()
//            .memoryCardModule(MemoryCardModule(2500))
//            .build()
//            .inject(this)
    }
}