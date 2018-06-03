package com.codefirst.scrumfirst.baseactivity

import android.support.v7.app.AppCompatActivity
import com.codefirst.scrumfirst.App

open class BaseActivity : AppCompatActivity() {

    fun getApp() = application as App
}