package de.budget.thus

import android.app.Application
import de.budget.thus.core.di.initKoin
import org.koin.android.ext.koin.androidContext

class AndroidApp : Application() {

  override fun onCreate() {
    super.onCreate()
    initDi()
  }

  private fun initDi() {
    initKoin {
      androidContext(this@AndroidApp)
    }
  }

}