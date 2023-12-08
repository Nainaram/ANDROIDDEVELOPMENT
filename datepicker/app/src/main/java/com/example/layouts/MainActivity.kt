package com.example.layouts

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale

class MainActivity : AppCompatActivity() {
    private lateinit var dateid:TextView
    private lateinit var selectid:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        dateid = findViewById(R.id.dateid)
        selectid = findViewById(R.id.selectid)
        selectid.setOnClickListener {
            val calender = Calendar.getInstance()
            val dateFormat =SimpleDateFormat("dd.MM.yyyy", Locale.US)

            val datePickerDialog = DatePickerDialog(this,DatePickerDialog.OnDateSetListener { datePicker,year, month, dayOfMonth ->
                calender.set(Calendar.YEAR,year)
                calender.set(Calendar.MONTH,month)
                calender.set(Calendar.DAY_OF_MONTH,dayOfMonth)
                    dateid.text = dateFormat.format(calender.time)  },
                calender.get(Calendar.YEAR),calender.get(Calendar.MONTH),calender.get(Calendar.DAY_OF_MONTH))
            datePickerDialog.show()
        }
    }
}