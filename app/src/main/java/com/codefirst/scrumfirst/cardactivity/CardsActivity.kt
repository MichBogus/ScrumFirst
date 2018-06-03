package com.codefirst.scrumfirst.cardactivity

import android.os.Bundle
import com.codefirst.scrumfirst.baseactivity.BaseActivity

class CardsActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        createInjection()
    }

    private fun createInjection() = getApp().mainComponent.giveCardsComponent().inject(this)
}