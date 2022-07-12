package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.util.Log.i
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bg = findViewById<ConstraintLayout>(R.id.background)
        val info = findViewById<TextView>(R.id.textView)
        val catordog = findViewById<TextView>(R.id.question)
        val helloButton = findViewById<Button>(R.id.helloButton)
        val catButton = findViewById<Button>(R.id.cats)
        val dogButton = findViewById<Button>(R.id.dogs)
        val lightmode = findViewById<Button>(R.id.light)
        val darkmode = findViewById<Button>(R.id.dark)
        //Hello Button Response
        helloButton.setOnClickListener {
            //Button Test
            Log.v("Hello world", "Button clicked!")
            // Hello Response
            Toast.makeText(this, "Hello! Hope you are doing well!", Toast.LENGTH_SHORT).show()
        }
        //Cat Button Response
        catButton.setOnClickListener {
            Toast.makeText(this,"Hello my fellow cat lover!", Toast.LENGTH_SHORT).show()
        }
        //Dog Button Response
        dogButton.setOnClickListener {
            Toast.makeText(this, "Dogs are adorable!", Toast.LENGTH_SHORT).show()
        }
        //Light mode button
        lightmode.setOnClickListener {
            bg.setBackgroundColor(getResources().getColor(R.color.white))
            info.setTextColor(getResources().getColor(R.color.black))
            catordog.setTextColor(getResources().getColor(R.color.black))
        }
        //Dark mode button
        darkmode.setOnClickListener {
            bg.setBackgroundColor(getResources().getColor(R.color.black))
            info.setTextColor(getResources().getColor(R.color.white))
            catordog.setTextColor(getResources().getColor(R.color.white))
        }
    }
}