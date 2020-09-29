package com.chethan.featurepostitemsforsale

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.chethan.featurepostitemsforsale.databinding.FragmentPostItemForSaleBinding
import com.chethan.views.autoCleared

class PostItemForSaleFragment : Fragment() {

    private var binding by autoCleared<FragmentPostItemForSaleBinding>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPostItemForSaleBinding.inflate(inflater, container, false)
        return binding.root
    }


}