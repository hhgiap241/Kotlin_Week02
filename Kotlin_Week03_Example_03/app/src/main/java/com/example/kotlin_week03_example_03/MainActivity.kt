package com.example.kotlin_week03_example_03

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myIntent: Intent = Intent(Intent.ACTION_VIEW, Uri.parse("content://contacts/people"))
        startActivity(myIntent)
    }
}