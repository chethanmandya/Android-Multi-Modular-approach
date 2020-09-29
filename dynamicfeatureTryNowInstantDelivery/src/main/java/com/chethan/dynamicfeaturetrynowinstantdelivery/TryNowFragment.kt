package com.chethan.dynamicfeaturetrynowinstantdelivery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.chethan.dynamicfeaturetrynowinstantdelivery.databinding.FragmentTryNowFrgamentBinding
import com.chethan.views.autoCleared

class TryNowFragment : Fragment() {

    private var binding by autoCleared<FragmentTryNowFrgamentBinding>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTryNowFrgamentBinding.inflate(inflater, container, false)
        return binding.root
    }


}