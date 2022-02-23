package com.example.kotlin_week03_example_05

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.core.app.ShareCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var inputText: EditText = findViewById(R.id.editText)
        var openWebsiteBtn: Button = findViewById(R.id.button)
        // open website handling
        openWebsiteBtn.setOnClickListener{
            // Get the URL text input from user
            val url = inputText!!.text.toString()
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
        // share text handling
        var shareTextBtn: Button = findViewById(R.id.button2)
        shareTextBtn.setOnClickListener {
            val txt: String = inputText!!.text.toString()
            val mimeType = "text/plain"
            ShareCompat.IntentBuilder
                .from(this)
                .setType(mimeType)
                .setChooserTitle("Choose your apps")
                .setText(txt)
                .startChooser()
        }
    }
}