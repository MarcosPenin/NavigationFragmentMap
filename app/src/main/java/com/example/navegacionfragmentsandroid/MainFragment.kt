package com.example.navegacionfragmentsandroid

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navegacionfragmentsandroid.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        //return inflater.inflate(R.layout.fragment_dest12, container, false)
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val navController = findNavController()
        binding.zoomNorth.setOnClickListener({navController.navigate(MainFragmentDirections.actionMainToNorth())})
        binding.zoomSouth.setOnClickListener{navController.navigate(MainFragmentDirections.actionMainToSouth())}

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
    }
