package com.simbiri.codemath

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.simbiri.unit3project.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var total = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.buttonAdd.setOnClickListener {
            addNumberToTotal()
        }
    }

    private fun addNumberToTotal() {
        val inputText = binding.editTextNumber.text.toString()
        if (inputText.isNotBlank()) {
            val number = inputText.toInt()
            total += number
            binding.textViewResult.text = "Total: $total"
            binding.editTextNumber.text.clear()
        }
    }
}
