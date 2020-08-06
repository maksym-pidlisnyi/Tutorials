package com.example.tutorials

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val btnApply : Button = findViewById(R.id.btnApply)
        btnApply.setOnClickListener {
            val firsName = editTextFirstName.text.toString()
            val lastName = editTextLastName.text.toString()
            val birthDate = editTextBirthDate.text.toString()
            val country = editTextCountry.text.toString()
            Log.d("MainActivity", "$firsName $lastName, born on $birthDate, in $country")

        }
    }
}