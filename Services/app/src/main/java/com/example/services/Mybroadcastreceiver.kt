package com.example.services

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

class Mybroadcastreceiver:BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val airplanemodeEnabled =intent?.getBooleanExtra("state",false)?: return
        if (airplanemodeEnabled){
            Toast.makeText( context,"Airplane mode enabled",Toast.LENGTH_SHORT).show()
            Log.i("Mybroadcastreceiver","Airplane mode enabled")

        }
        else{
            Toast.makeText(context,"Airplane mode Disabled",Toast.LENGTH_SHORT).show()
            Log.i("Mybroadcastreceiver","Airplane mode disabled")
        }
        }
}