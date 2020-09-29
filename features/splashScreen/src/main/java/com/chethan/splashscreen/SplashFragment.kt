package com.chethan.splashscreen

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.chethan.splashscreen.databinding.FragmentSplashBinding
import com.chethan.views.autoCleared
import me.vponomarenko.injectionmanager.x.XInjectionManager


class SplashFragment : Fragment() {

    private var binding by autoCleared<FragmentSplashBinding>()


    private val navigation: SplashScreenFragmentNavigation by lazy {
        XInjectionManager.findComponent<SplashScreenFragmentNavigation>()
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSplashBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Handler(Looper.getMainLooper()).postDelayed({
            navigation.openHomeScreen()
        }, 3000)


    }


}