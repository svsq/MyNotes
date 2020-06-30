package com.svsq.mynotes

import android.app.Application
import com.svsq.mynotes.android.AppBinderFactory
import com.svsq.mynotes.core.AppComponent
import com.svsq.mynotes.core.AppContext
import com.svsq.mynotes.core.ui.AppViewModel
import net.apptronic.core.android.plugins.installAndroidApplicationPlugin

class App : Application() {

    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        AppContext.installAndroidApplicationPlugin(this) {
            binderFactory(AppBinderFactory)
            bindActivity(MainActivity::class, AppViewModel::class) /*{
                //it.onBackPressed()
            }*/
        }
        appComponent = AppComponent()
    }
}