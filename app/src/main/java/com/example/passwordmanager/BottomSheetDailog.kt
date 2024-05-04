package com.example.passwordmanager

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import com.example.passwordmanager.databinding.ActivityMainBinding
import com.example.passwordmanager.databinding.ActivityMainBinding.inflate
import com.example.passwordmanager.databinding.BottomdailogbarBinding
import com.example.passwordmanager.viewModel.MainApplication
import com.example.passwordmanager.viewModel.myViewModel
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.coroutines.launch


class BottomSheetDialog : BottomSheetDialogFragment() {

    private  lateinit var  viewModel : myViewModel
    private lateinit var binding: BottomdailogbarBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        binding = BottomSheetDialogFragment.
//        val v: View = inflater.inflate(
//            R.layout.bottomdailogbar,
//            container, false
//        )
        binding = BottomdailogbarBinding.inflate(inflater, container, false)
        val view = binding.root

//        val course_button = v.findViewById<Button>(R.id.course_button)
//        val AcName = v.findViewById<Button>(R.id.AcName)
//        val UserName = v.findViewById<Button>(R.id.userName)
//        val password = v.findViewById<Button>(R.id.password)


        viewModel = myViewModel()

        binding.courseButton.setOnClickListener {

            if (binding.AcName.text.isEmpty() || binding.userName.text.isEmpty() || binding.password.text.isEmpty() )
            {
                Toast.makeText(
                    activity,
                    "fill all boxex", Toast.LENGTH_SHORT
                ).show()
                dismiss()
            }

            else {
                lifecycleScope.launch {
                    viewModel.addPassInfo(
                        binding.AcName.text.toString(),
                        binding.userName.text.toString(),
                        binding.password.text.toString()
                    )
                }
                Toast.makeText(
                    activity,
                    "password Added", Toast.LENGTH_SHORT
                ).show()
                dismiss()
            }

        }
        return view
    }
}