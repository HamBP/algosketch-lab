package me.algosketch.manualdependencyinjection

import android.app.Application

class MdiApplication : Application() {
    val appContainer = AppContainer()
}