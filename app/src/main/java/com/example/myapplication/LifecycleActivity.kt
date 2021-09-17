package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class LifecycleActivity : AppCompatActivity() {
    private lateinit var textView: TextView
    private lateinit var lifecycleButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lifecycle)

        textView = findViewById(R.id.textView_lifecycle)
        lifecycleButton = findViewById(R.id.lifecycle_button)

        textView.text = "Olá"

        lifecycleButton.setOnClickListener {
            textView.text = "Carrefour"
        }

        Log.i("LifecycleActivity", "onCreate Called")
    }

    override fun onStart() {
        super.onStart()
        Log.i("LifecycleActivity", "onStart Called")
    }

    override fun onResume() {
        super.onResume()
        Log.i("LifecycleActivity", "onResume Called")
    }

    override fun onPause() {
        super.onPause()
        Log.i("LifecycleActivity", "onPause Called")
    }

    override fun onStop() {
        super.onStop()
        Log.i("LifecycleActivity", "onStop Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("LifecycleActivity", "onDestroy Called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("LifecycleActivity", "onRestart Called")
    }
}