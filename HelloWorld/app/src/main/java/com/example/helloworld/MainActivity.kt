package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.util.Log.i
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.helloButton)
        button.setOnClickListener {
            //Button Test
            Log.v("Hello world", "Button clicked!")
            // Hello Response
            Toast.makeText(this, "Hello! Hope you are doing well!", Toast.LENGTH_SHORT).show()
        }
    }
}