package com.chethan.application_1

import android.app.Application
import me.vponomarenko.injectionmanager.IHasComponent
import me.vponomarenko.injectionmanager.x.XInjectionManager


class LayerModularApplication : Application() {


    override fun onCreate() {
        super.onCreate()
        XInjectionManager.init(this)
        XInjectionManager.bindComponentToCustomLifecycle(object : IHasComponent<AppNavigator> {
            override fun getComponent(): AppNavigator = AppNavigator()
        })
    }
}