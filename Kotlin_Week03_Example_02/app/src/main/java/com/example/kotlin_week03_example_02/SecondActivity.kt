package com.example.kotlin_week03_example_02

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val intent = intent
        val value = intent.getStringExtra("data_1")
        val textView: TextView = findViewById(R.id.textView2)
        textView.setText(value)

        findViewById<Button>(R.id.button2).setOnClickListener{
            val replyIntent = Intent()
            replyIntent.putExtra("data_2", "This is value from 2nd activity")
            setResult(Activity.RESULT_OK, replyIntent)
            finish()
        }
    }
}