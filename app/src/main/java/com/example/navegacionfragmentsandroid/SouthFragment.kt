package com.example.navegacionfragmentsandroid

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navegacionfragmentsandroid.databinding.FragmentSouthBinding

class SouthFragment : Fragment() {
    private var _binding: FragmentSouthBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSouthBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navController = Navigation.findNavController(view)
        binding.zoomBrazil.setOnClickListener({navController.navigate(R.id.action_south_to_brazil)})
        binding.zoomArgentina.setOnClickListener({navController.navigate(R.id.action_south_to_argentina)})
        }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}