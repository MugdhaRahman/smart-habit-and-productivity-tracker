package com.mrapps.smarthabitproductivitytracker

import android.app.Application
import com.mrapps.smarthabitproductivitytracker.di.initializeKoin
import org.koin.android.ext.koin.androidContext

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        initializeKoin {
            androidContext(androidContext = this@MyApplication)
        }
    }
}