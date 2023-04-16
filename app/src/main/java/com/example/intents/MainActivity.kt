package com.example.intents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Btnintents =  findViewById<Button>(R.id.btnIntent)

        Btnintents.setOnClickListener{
            //Now work is to open new activity
            intent = Intent(applicationContext, SecondActivity::class.java)
            startActivity(intent)
            //here intent is the method
        }
    }
}