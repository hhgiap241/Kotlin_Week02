package com.example.kotlin_week03_example_01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button2).setOnClickListener{
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("data", "This is value sent from first activity")
            startActivity(intent)
        }
    }
}