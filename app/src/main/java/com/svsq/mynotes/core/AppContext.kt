package com.svsq.mynotes.core

import net.apptronic.core.component.context.coreContext


/**
 * This context is single instance of root [Context], which is responsible for whole app.
 */
val AppContext = coreContext {
    //dependencyDispatcher.addModule(DataModule)
    dependencyDispatcher.addModule(AppModule)
}