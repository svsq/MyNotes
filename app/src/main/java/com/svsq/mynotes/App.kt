package com.svsq.mynotes

import android.app.Application
import com.svsq.mynotes.android.AppBinderFactory
import com.svsq.mynotes.core.AppComponent
import com.svsq.mynotes.core.AppContext
import com.svsq.mynotes.core.ui.AppViewModel
import net.apptronic.core.android.plugins.installAndroidApplicationPlugin

/**
 * [Application] class required to hold instance of main application [AppComponent]
 */

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
        // last is creating AppComponent and storing it inside Application class to prevent from garbage collection
        appComponent = AppComponent()
    }
}