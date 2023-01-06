package com.example.demoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val greetingTextView = findViewById<TextView>(R.id.helloView)
        val inputText = findViewById<EditText>(R.id.helloInput)
        val clickMeBtn = findViewById<Button>(R.id.clickMe)
        val offersBtn = findViewById<Button>(R.id.offersBtn)
        var enteredName = ""

        clickMeBtn.setOnClickListener{
            enteredName = inputText.text.toString()
            if(enteredName == ""){
                greetingTextView.text = ""
                Toast.makeText(
                    this@MainActivity,
                    "Please enter your name!",
                    Toast.LENGTH_SHORT
                ).show()
                offersBtn.visibility = INVISIBLE
            }else{
                val message = "Hello $enteredName"
                greetingTextView.text = message
                inputText.text.clear()
                offersBtn.visibility = VISIBLE
            }
        }
        offersBtn.setOnClickListener{
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("USER", enteredName)
            startActivity(intent)
        }

    }
}