package com.example.kotlin_example_week03_01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("d", "onCreate")
        val exitBtn: Button = findViewById(R.id.button3)
        val showText: TextView = findViewById(R.id.state)
        val inputText: EditText = findViewById(R.id.editText)
        exitBtn!!.setOnClickListener{
            finish()
        }

    }

    override fun onStart() {
        super.onStart()
        Log.i("d", "onStart")
    }
    override fun onResume() {
        super.onResume()
        Log.i("d", "onResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("d", "onRestart")
    }

    override fun onPause() {
        super.onPause()
        Log.i("d", "onPause")
    }


    override fun onStop() {
        super.onStop()
        Log.i("d", "onStop")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.i("d", "onDestroy")
    }
}