package com.example.demoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val username = intent.getStringExtra("USER")
        val offerTextView = findViewById<TextView>(R.id.offerText)

        val message = "$username, you will get free access to all the content for a month. Enjoy!"
        offerTextView.text = message
    }
}