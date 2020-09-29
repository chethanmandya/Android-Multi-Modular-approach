package com.chethan.onboarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.chethan.onboarding.databinding.FragmentOnBoardingBinding
import com.chethan.views.autoCleared


class OnBoardingFragment : Fragment() {

    private var binding by autoCleared<FragmentOnBoardingBinding>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOnBoardingBinding.inflate(inflater, container, false)
        return binding.root
    }


}