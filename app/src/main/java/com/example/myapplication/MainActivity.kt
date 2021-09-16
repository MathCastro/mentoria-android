package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private lateinit var buttonLayout: Button
    private lateinit var buttonNavigationParams: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonLayout = findViewById(R.id.buttonLayout)
        buttonNavigationParams = findViewById(R.id.buttonNavigationParams)

        buttonLayout.setOnClickListener {
            val intent = Intent(this, LayoutActivity::class.java)
            startActivity(intent)
        }
        buttonNavigationParams.setOnClickListener {
            val intent = Intent(this, NavigationParamsActivity::class.java)
            intent.putExtra("key", "Mentoria Carrefour")
            startActivity(intent)
        }

    }

}