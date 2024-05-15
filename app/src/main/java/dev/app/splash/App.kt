package dev.app.splash

import android.app.Application
import android.os.SystemClock

class App: Application() {

    override fun onCreate() {
        super.onCreate()
        SystemClock.sleep(1000)
    }
}