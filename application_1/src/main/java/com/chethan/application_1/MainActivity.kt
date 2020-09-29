package com.chethan.application_1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import me.vponomarenko.injectionmanager.x.XInjectionManager

class MainActivity : AppCompatActivity() {

    private val navigator: AppNavigator by lazy {
        XInjectionManager.findComponent<AppNavigator>()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onResume() {
        super.onResume()
        navigator.bind(findNavController(R.id.nav_host_fragment))
    }

    override fun onPause() {
        super.onPause()
        navigator.unbind()
    }

    override fun onSupportNavigateUp(): Boolean = findNavController(R.id.nav_host_fragment).navigateUp()
}