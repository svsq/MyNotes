package com.svsq.mynotes.android.binder

import android.view.View
import com.svsq.mynotes.R
import com.svsq.mynotes.core.ui.AppViewModel
import net.apptronic.core.android.viewmodel.ViewBinder
import net.apptronic.core.android.viewmodel.bindings.navigation.bindStackNavigator
import kotlinx.android.synthetic.main.app.view.*

class AppViewBinder : ViewBinder<AppViewModel>() {

    override var layoutResId: Int? = R.layout.app

    override fun onBindView(view: View, viewModel: AppViewModel) {
        with(view) {
            bindStackNavigator(appContainer, viewModel.navigator)
        }
    }

}