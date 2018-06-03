package com.codefirst.scrumfirst

import android.support.multidex.MultiDexApplication
import com.codefirst.scrumfirst.basedi.MainComponent

class App : MultiDexApplication() {

    lateinit var mainComponent: MainComponent

    override fun onCreate() {
        super.onCreate()

        mainComponent.inject(this)
    }

    private fun initComponent() {
        mainComponent = DaggerMainComponent.create()
    }
}