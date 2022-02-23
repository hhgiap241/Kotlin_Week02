package com.example.kotlin_week03_example_01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        val intent = intent
        val value = intent.getStringExtra("data")
        val textView: TextView = findViewById(R.id.textView2)
        textView.setText(value)
    }
}