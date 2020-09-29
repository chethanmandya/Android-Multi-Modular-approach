package com.chethan.privacypolicy

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.chethan.privacypolicy.databinding.FragmentPrivacyPolicyBinding
import com.chethan.views.autoCleared


class PrivacyPolicyFragment : Fragment() {

    private var binding by autoCleared<FragmentPrivacyPolicyBinding>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPrivacyPolicyBinding.inflate(inflater, container, false)
        return binding.root
    }


}