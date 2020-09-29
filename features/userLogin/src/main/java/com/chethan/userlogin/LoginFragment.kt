package com.chethan.userlogin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.chethan.userlogin.databinding.FragmentLoginBinding
import com.chethan.views.autoCleared

class LoginFragment : Fragment() {

    private var binding by autoCleared<FragmentLoginBinding>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }


}