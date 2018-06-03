package com.codefirst.scrumfirst.basedi

import com.codefirst.scrumfirst.App
import com.codefirst.scrumfirst.cardactivity.di.CardsComponent
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [(MainModule::class)])
interface MainComponent {

    fun inject(app: App)

    fun giveCardsComponent(): CardsComponent
}