package com.example.user_form_app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val etPersonName = findViewById<EditText>(R.id.etPersonName)
        val etPersonAge = findViewById<EditText>(R.id.etPersonAge)
        val submitBtn = findViewById<Button>(R.id.submitBtn)

        submitBtn.setOnClickListener{
            val name = etPersonName.text.toString()
            val age = etPersonAge.text.toString()

            if (name.isEmpty()){
                etPersonName.error = "Please enter your name"
                etPersonName.requestFocus()
                return@setOnClickListener
            }

            if (age.isEmpty()){
                etPersonAge.error = "Please enter your age"
                etPersonAge.requestFocus()
                return@setOnClickListener
            }

            val intent = Intent(this, SecondActivity::class.java).apply {
                putExtra("EXTRA_NAME", name)
                putExtra("EXTRA_AGE", age)
            }
            startActivity(intent)
            etPersonName.text.clear()
            etPersonAge.text.clear()
        }

    }
}