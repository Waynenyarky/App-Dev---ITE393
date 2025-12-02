package com.example.user_form_app

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)


        val ivBackBtn = findViewById<ImageView>(R.id.ivBackBtn)
        val viewDetails = findViewById<TextView>(R.id.viewDetails)

        val name = intent.getStringExtra("EXTRA_NAME")
        val age = intent.getStringExtra("EXTRA_AGE")
        val message = "Hello, I am $name \n and I am $age years old. \nNice meeting you!!"
        viewDetails.text = message

        ivBackBtn.setOnClickListener{
            finish()
        }

    }
}