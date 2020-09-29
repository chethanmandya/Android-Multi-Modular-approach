package com.chethan.dynamicfeatureinteractiveguidemanageinstalled

import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.chethan.dynamicfeatureinteractiveguidemanageinstalled.databinding.FragmentInteractiveGuideBinding
import com.chethan.views.autoCleared

class InteractiveGuide : Fragment() {

    private var binding by autoCleared<FragmentInteractiveGuideBinding>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentInteractiveGuideBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.userLogin.setOnClickListener {

        }


    }


}