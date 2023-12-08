package com.example.pokemon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var submitbtn :Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        submitbtn = findViewById(R.id.submitbtn)
        submitbtn.setOnClickListener {
            Toast.makeText(this,"this is the button", Toast.LENGTH_SHORT)
        }
    }
}