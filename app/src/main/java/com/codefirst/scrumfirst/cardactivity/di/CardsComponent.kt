package com.codefirst.scrumfirst.cardactivity.di

import com.codefirst.scrumfirst.cardactivity.CardsActivity
import dagger.Subcomponent

@Subcomponent(modules = [])
interface CardsComponent {

    fun inject(activity: CardsActivity)
}