package com.example.kotlin_week03_example_04

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var urlText: EditText = findViewById(R.id.editText)
        var button: Button = findViewById(R.id.button)
        button.setOnClickListener{
            // Get the URL text input from user
            val url = urlText!!.text.toString()
            // Parse the URI and create the intent.
            val webpage: Uri = Uri.parse(url)
            val intent = Intent(Intent.ACTION_VIEW, webpage)
//            startActivity(intent)
            // Find an activity to hand the intent and start that activity.
            if (intent.resolveActivity(packageManager) != null) {
                startActivity(intent)
            } else {
                Log.i("ImplicitIntents", "Can't handle this intent!")
            }
        }
    }
}