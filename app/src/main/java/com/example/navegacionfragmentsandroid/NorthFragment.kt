package com.example.navegacionfragmentsandroid

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navegacionfragmentsandroid.databinding.FragmentNorthBinding
import com.example.navegacionfragmentsandroid.databinding.FragmentSouthBinding


class NorthFragment : Fragment() {
    private var _binding: FragmentNorthBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentNorthBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navController = Navigation.findNavController(view)

        binding.zoomCanada.setOnClickListener({navController.navigate(NorthFragmentDirections.actionNorthToCanada())})
        binding.zoomEEUU.setOnClickListener({navController.navigate(NorthFragmentDirections.actionNorthToEeuu())})
        binding.zoomMexico.setOnClickListener({navController.navigate(NorthFragmentDirections.actionNorthToMexico())})


    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}