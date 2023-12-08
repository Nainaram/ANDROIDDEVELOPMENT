package com.example.calculator


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.CheckedTextView
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    private lateinit var firstnum: EditText
    private lateinit var secondnum: EditText
    private lateinit var result: TextView
    private lateinit var buttonadd: Button
    private lateinit var buttonsub: Button
    private lateinit var buttonmul: Button
    private lateinit var buttondiv: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        firstnum = findViewById(R.id.firstnum)
        secondnum = findViewById(R.id.secondnum)
        result = findViewById(R.id.result)
        buttonadd = findViewById(R.id.buttonadd)
        buttonsub = findViewById(R.id.buttonsub)
        buttonmul = findViewById(R.id.buttonmul)
        buttondiv = findViewById(R.id.buttondiv)
        buttonadd.setOnClickListener {
            var num1 = firstnum.text.toString()
            var num2 = secondnum.text.toString()
            if (num1.isEmpty()) {
                Toast.makeText(this, "enter the first number", Toast.LENGTH_SHORT).show()
            } else if (num2.isEmpty()) {
                Toast.makeText(this, "enter the second number", Toast.LENGTH_SHORT).show()

            } else {
                var sum = num1.toInt() + num2.toInt()
                result.text = sum.toString()
            }
        }
        buttonsub.setOnClickListener {
            var num1 = firstnum.text.toString()
            var num2 = secondnum.text.toString()
            if (num1.isEmpty()) {
                Toast.makeText(this, "enter the first number", Toast.LENGTH_SHORT).show()
            } else if (num2.isEmpty()) {
                Toast.makeText(this, "enter the second number", Toast.LENGTH_SHORT).show()

            } else {
                var sum = num1.toInt() - num2.toInt()
                result.text = sum.toString()
            }
        }
        buttonmul.setOnClickListener {
            var num1 = firstnum.text.toString()
            var num2 = secondnum.text.toString()
            if (num1.isEmpty()) {
                Toast.makeText(this, "enter the first number", Toast.LENGTH_SHORT).show()
            } else if (num2.isEmpty()) {
                Toast.makeText(this, "enter the second number", Toast.LENGTH_SHORT).show()

            } else {
                var sum = num1.toInt() * num2.toInt()
                result.text = sum.toString()
            }
        }
        buttondiv.setOnClickListener {
            var num1 = firstnum.text.toString()
            var num2 = secondnum.text.toString()
            if (num1.isEmpty()) {
                Toast.makeText(this, "enter the first number", Toast.LENGTH_SHORT).show()
            } else if (num2.isEmpty()) {
                Toast.makeText(this, "enter the second number", Toast.LENGTH_SHORT).show()

            } else {
                if (num1.toInt() == 0 ) {
                    Toast.makeText(this, "UNDEFINED", Toast.LENGTH_SHORT).show()
                }
                else if (num2.toInt() ==0) {
                    Toast.makeText(this, "DIVISION NOT POSSIBLE", Toast.LENGTH_SHORT).show()
                }
                else {
                    var sum = num1.toInt() / num2.toInt()
                    result.text = sum.toString()
                }
            }
        }
    }
}
