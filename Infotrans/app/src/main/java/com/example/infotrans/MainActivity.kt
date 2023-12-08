package com.example.infotrans

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var Buttoncall:Button
    private lateinit var Buttonemail: Button
    private lateinit var Buttonmsg: Button
    private lateinit var Buttonshare:Button
    private lateinit var Message :EditText
    private lateinit var sentdata:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Buttoncall =findViewById(R.id.Buttoncall)
        Buttonemail = findViewById(R.id.Buttonemail)
        Buttonmsg = findViewById(R.id.Buttonmsg)
        Buttonshare = findViewById(R.id.Buttonshare)
        Message = findViewById(R.id.Message)
        sentdata= findViewById(R.id.sentdata)




        Buttoncall.setOnClickListener{
            val callintent = Intent()
            callintent.action =Intent.ACTION_DIAL
            callintent.data = Uri.parse("tel: +919110792672")
            startActivity(callintent)
        }
            sentdata.setOnClickListener {
                val msg= Message.text.toString()
                val intent =Intent(this, SecondActivity::class.java)
                intent.putExtra("Message",msg)
                startActivity(intent)

            }
        Buttonmsg.setOnClickListener{
            val msgintent =Intent()
            msgintent.action =Intent.ACTION_SENDTO
            msgintent.data = Uri.parse("smsto: +919110792672")
            msgintent.putExtra("sms_body", "Hello FROM MR.nainaram")
            startActivity(msgintent)
        }
        Buttonemail.setOnClickListener{
            val emailintent = Intent(Intent.ACTION_SEND)
            emailintent.type ="message/rfc822"
            //emailintent.type = "text/plain"
            emailintent.putExtra(Intent.EXTRA_EMAIL,"nainaram@gmail.com")
            emailintent.putExtra(Intent.EXTRA_SUBJECT, "infotransfer the informaton")
            emailintent.putExtra(Intent.EXTRA_TEXT, "Welcome to android development course made by skill vertex thankyou.")
            startActivity(emailintent)
        }
        Buttonshare.setOnClickListener {
            val shareintent =Intent()
            shareintent .action=Intent.ACTION_SEND
            shareintent.type ="text/plain"
            shareintent.putExtra(Intent.EXTRA_TEXT," checkou the latest version of skillvertex  https://skillvertex.in")
            startActivity(shareintent)
        }
    }
}