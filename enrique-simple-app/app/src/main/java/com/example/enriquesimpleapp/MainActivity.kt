package com.example.enriquesimpleapp


import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val etFirstNum = findViewById<EditText>(R.id.etFirstNum) //First Text View
        val etSecondNum = findViewById<EditText>(R.id.etSecondNum) //Second Text View
        val btn1 = findViewById<Button>(R.id.btn1) //"+"Button
        val btn2 = findViewById<Button>(R.id.btn2) //"-"Button
        val btn3 = findViewById<Button>(R.id.btn3) //"x"Button
        val btn4 = findViewById<Button>(R.id.btn4) //"/"Button
        val tvResult = findViewById<TextView>(R.id.tvResult) // Show the answer
        val ResetBtn = findViewById<Button>(R.id.ResetBtn) // Reset Button


        fun checkInputDisplayMessage(){
            if (etFirstNum.text.isEmpty() || etSecondNum.text.isEmpty()){
                Toast.makeText(this, "Please Input a number First before clicking!", Toast.LENGTH_SHORT).show()
                tvResult.text = ""
            }
        }


        ResetBtn.setOnClickListener {
            checkInputDisplayMessage()

            etFirstNum.text.clear()
            etSecondNum.text.clear()
            tvResult.text = "0"

            Toast.makeText(this, "A button is clicked!", Toast.LENGTH_SHORT).show()
        }


        btn1.setOnClickListener{
            checkInputDisplayMessage()

            if (etFirstNum.text.isNotEmpty() && etSecondNum.text.isNotEmpty()){
                val num1 = etFirstNum.text.toString().toDouble()
                val num2 = etSecondNum.text.toString().toDouble()
                val result = num1 + num2

                tvResult.text = if (result == result.toInt().toDouble()){
                    result.toInt().toString()
                }else{
                    String.format("%.2f", result)
                }
                Toast.makeText(this, "A button is clicked!", Toast.LENGTH_SHORT).show()
            }

        }





        btn2.setOnClickListener{
            checkInputDisplayMessage()
            if (etFirstNum.text.isNotEmpty() && etSecondNum.text.isNotEmpty()){
                val num1 = etFirstNum.text.toString().toDouble()
                val num2 = etSecondNum.text.toString().toDouble()
                val result = num1 - num2

                tvResult.text = if (result == result.toInt().toDouble()){
                    result.toInt().toString()
                }else{
                    String.format("%.2f", result)
                }

                Toast.makeText(this, "A button is clicked!", Toast.LENGTH_SHORT).show()
            }
        }


        btn3.setOnClickListener{
            checkInputDisplayMessage()
            if (etFirstNum.text.isNotEmpty() && etSecondNum.text.isNotEmpty()){
                val num1 = etFirstNum.text.toString().toDouble()
                val num2 = etSecondNum.text.toString().toDouble()
                val result = num1 * num2

                tvResult.text = if (result == result.toInt().toDouble()){
                    result.toInt().toString()
                }else{
                    String.format("%.2f", result)
                }

                Toast.makeText(this, "A button is clicked!", Toast.LENGTH_SHORT).show()
            }
        }

        btn4.setOnClickListener{
            checkInputDisplayMessage()
            if (etFirstNum.text.isNotEmpty() && etSecondNum.text.isNotEmpty()){
                val num1 = etFirstNum.text.toString().toDouble()
                val num2 = etSecondNum.text.toString().toDouble()

                if (num2 != 0.0) {
                    val result = num1 / num2

                    tvResult.text = if (result == result.toInt().toDouble()) {
                        result.toInt().toString()
                    } else {
                        String.format("%.2f", result)
                    }
                }else{
                    tvResult.text = "Error"
                }

                Toast.makeText(this, "A button is clicked!", Toast.LENGTH_SHORT).show()
            }
        }

    }
}