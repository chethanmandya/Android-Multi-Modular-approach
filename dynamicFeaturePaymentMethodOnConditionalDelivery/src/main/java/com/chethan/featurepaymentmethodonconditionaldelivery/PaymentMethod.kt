package com.chethan.featurepaymentmethodonconditionaldelivery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.chethan.featurepaymentmethodonconditionaldelivery.databinding.FragmentPaymentMethodGuideBinding
import com.chethan.views.autoCleared

class PaymentMethod : Fragment() {

    private var binding by autoCleared<FragmentPaymentMethodGuideBinding>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPaymentMethodGuideBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.userLogin.setOnClickListener {

        }
    }


}