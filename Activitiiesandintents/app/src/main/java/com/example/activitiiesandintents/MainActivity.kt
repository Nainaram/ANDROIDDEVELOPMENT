package com.example.activitiiesandintents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import kotlin.math.log

class MainActivity : AppCompatActivity() {
        private lateinit var  Gotothesecond:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("MainActivity","onCreate method called")
        Gotothesecond = findViewById(R.id.Gotothesecond)
        Gotothesecond.setOnClickListener{
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i("MainActivity","onStart method Called")
    }
    override fun onPause() {
        super.onPause()
        Log.i("MainActivity","Onpause method called")
    }

    override fun onResume() {
        super.onResume()
        Log.i("MainActivity","OnResume method called")
    }



    override fun onRestart() {
        super.onRestart()
        Log.i("MainActivity","OnRestart method called")

    }

    override fun onStop() {
        super.onStop()
        Log.i("MainActivity","Onstop method called")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.i("MainActivity", "OnDestroy method called")
    }
}