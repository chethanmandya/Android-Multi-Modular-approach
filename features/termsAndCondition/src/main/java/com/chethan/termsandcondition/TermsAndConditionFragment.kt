package com.chethan.termsandcondition

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.chethan.termsandcondition.databinding.FragmentTermsAndConditionsBinding
import com.chethan.views.autoCleared

class TermsAndConditionFragment : Fragment() {

    private var binding by autoCleared<FragmentTermsAndConditionsBinding>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTermsAndConditionsBinding.inflate(inflater, container, false)
        return binding.root
    }


}