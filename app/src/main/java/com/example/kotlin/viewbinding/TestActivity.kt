package com.example.kotlin.viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlin.R
import com.example.kotlin.databinding.ActivityTestBinding
import com.example.kotlin.viewbinding.viewmodel.MyViewModel

class TestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var binding = ActivityTestBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val viewModel : MyViewModel

//        binding.lifecycleOwner = this

//        binding.name.text = viewModel.name
//        binding.button.setOnClickListener { viewModel.userClicked() }
    }
}