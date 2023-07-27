package com.alexis.ec03_ay.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.alexis.ec03_ay.databinding.FragmentApiInfoBinding

class ApiInfoFragment : Fragment() {

    private lateinit var binding: FragmentApiInfoBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentApiInfoBinding.inflate(inflater,container,false)
        return binding.root
    }


}