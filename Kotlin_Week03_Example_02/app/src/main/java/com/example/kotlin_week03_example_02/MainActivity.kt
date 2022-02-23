package com.example.kotlin_week03_example_02

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AccelerateInterpolator
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button).setOnClickListener{
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("data_1", "This is value sent from first activity")

            startActivityForResult(intent, REQUEST_CODE)
        }
    }
    val REQUEST_CODE = 1111
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode === REQUEST_CODE){
            if (resultCode === Activity.RESULT_OK){
                val reply = data!!.getStringExtra("data_2")
                val textView: TextView = findViewById(R.id.textView)
                textView.setText(reply)
            }
        }
    }
}