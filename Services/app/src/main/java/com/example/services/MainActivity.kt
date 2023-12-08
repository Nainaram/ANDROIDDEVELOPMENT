package com.example.services

import android.content.BroadcastReceiver
import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var startbtn : Button
    private lateinit var stopbtn:Button
    private lateinit var receiver: BroadcastReceiver
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        receiver =Mybroadcastreceiver()
        val intentFilter = IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED)
        registerReceiver(receiver,intentFilter)
//        startbtn = findViewById(R.id.startbtn)
//        stopbtn = findViewById(R.id.stopbtn)
//        startbtn.setOnClickListener {
//            startService(Intent(this,Myservice::class.java))
//        }
//        stopbtn.setOnClickListener {
//            stopService(Intent(this,Myservice::class.java))
//        }

    }override fun onDestroy() {
        super.onDestroy()
        unregisterReceiver(receiver)        }
}