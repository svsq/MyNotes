package com.svsq.mynotes.core.ui

import net.apptronic.core.component.context.Context
import net.apptronic.core.component.di.declareModule
import net.apptronic.core.mvvm.viewmodel.ViewModel
import net.apptronic.core.mvvm.viewmodel.defineViewModelContext

val AppViewModelContext = defineViewModelContext {
    dependencyDispatcher.addModule(AppUiModule)
}

private val AppUiModule = declareModule {
    // TODO
}

class AppViewModel(parent: Context) : ViewModel(parent, AppViewModelContext) {

    init {
        context.dependencyDispatcher.addInstance<Router>(AppRouter(this))
    }

    val navigator = stackNavigator()

}

private class AppRouter(private val target: AppViewModel) : Router {

    override fun closeApp() {
        target.closeSelf()
    }

}