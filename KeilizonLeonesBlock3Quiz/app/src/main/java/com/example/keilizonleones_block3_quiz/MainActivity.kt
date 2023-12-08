package com.example.keilizonleones_block3_quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonOpenActivity: Button = findViewById(R.id.button)

        buttonOpenActivity.setOnClickListener {

            val intent = Intent(this, BMIcalcu::class.java)


            startActivity(intent)

        }
    }

    fun backbttn(view: View) {
        finish()
    }
}