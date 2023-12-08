package com.example.intentsandactivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
            Log.i("MainAcitivity" ," on start method called")
    }

    override fun onPause() {
        super.onPause()
            Log.i("MainaActiviy","on pause method called")
    }

    override fun onResume() {
        super.onResume()
    Log.i("MainActivity","on resume method called")}

    override fun onRestart() {
        super.onRestart()
    Log.i("MainActivity","on RESTART MTHOD CALELD")
    } }