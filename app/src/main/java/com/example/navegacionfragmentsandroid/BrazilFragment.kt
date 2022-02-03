package com.example.navegacionfragmentsandroid

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navegacionfragmentsandroid.databinding.FragmentBrazilBinding
import com.example.navegacionfragmentsandroid.databinding.FragmentNorthBinding

class BrazilFragment : Fragment() {
    private var _binding: FragmentBrazilBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBrazilBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navController = Navigation.findNavController(view)

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}