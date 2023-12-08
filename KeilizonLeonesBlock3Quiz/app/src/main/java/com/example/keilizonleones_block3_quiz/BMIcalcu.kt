package com.example.keilizonleones_block3_quiz

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class BMIcalcu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bmicalcu)
        val editTextWeight: EditText = findViewById(R.id.editTextWeight)
        val editTextHeight: EditText = findViewById(R.id.editTextHeight)
        val buttonCalculateBMI: Button = findViewById(R.id.buttonCalculateBMI)
        val textViewResult: TextView = findViewById(R.id.textViewResult)

        buttonCalculateBMI.setOnClickListener {
            calculateBMI(editTextWeight.text.toString(), editTextHeight.text.toString(), textViewResult)
        }
    }

    private fun calculateBMI(weight: String, height: String, resultTextView: TextView) {
        if (weight.isNotEmpty() && height.isNotEmpty()) {
            val weightInKg = weight.toFloat()
            val heightInM = height.toFloat()

            val bmi = weightInKg / (heightInM * heightInM)

            resultTextView.text = "BMI Result: $bmi"
        } else {
            resultTextView.text = "Please enter valid weight and height."
        }
    }
}