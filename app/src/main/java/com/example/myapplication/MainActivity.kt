package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private lateinit var buttonLayout: Button
    private lateinit var buttonNavigationParams: Button
    private lateinit var buttonListView: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonLayout = findViewById(R.id.buttonLayout)
        buttonNavigationParams = findViewById(R.id.buttonNavigationParams)
        buttonListView = findViewById(R.id.button_listview)

        buttonLayout.setOnClickListener {
            val intent = Intent(this, LayoutActivity::class.java)
            startActivity(intent)
        }
        buttonNavigationParams.setOnClickListener {
            val intent = Intent(this, NavigationParamsActivity::class.java)
            intent.putExtra("key", "Mentoria Carrefour")
            startActivity(intent)
        }

        buttonListView.setOnClickListener {
            val intent = Intent(this, ListViewActivity::class.java)
            startActivity(intent)
        }

    }

}