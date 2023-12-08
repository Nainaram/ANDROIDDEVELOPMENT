package com.example.securitymanager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.CheckedTextView
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var textView:TextView
    private  lateinit var button: Button
    private lateinit var  editText: EditText

var count  =0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.textView)
        button = findViewById(R.id.buttonPress)
        editText = findViewById(R.id.edittext)
        button.setOnClickListener{
         var msg =   editText.text.toString()
            textView.text =msg
            if (msg.isEmpty()){
                Toast.makeText(this,"Please enter some Text! ",Toast.LENGTH_LONG).show()
                textView.text ="Default Text"
            }
        }
    }
}