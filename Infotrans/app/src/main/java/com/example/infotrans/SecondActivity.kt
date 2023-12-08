package com.example.infotrans

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    private lateinit var txtmessage:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondactivity)
        txtmessage =findViewById(R.id.txtmessage)
        val getData = intent
        val msg = getData.getStringExtra("Message")
        txtmessage.text = msg
    }
}