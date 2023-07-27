package com.alexis.ec03_ay.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.alexis.ec03_ay.databinding.FragmentApiFavBinding

class ApiFavFragment : Fragment() {

    private lateinit var binding: FragmentApiFavBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentApiFavBinding.inflate(inflater,container,false)
        return binding.root
    }

}