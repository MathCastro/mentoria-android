package com.example.myapplication

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class NavigationParamsActivity : AppCompatActivity() {
    private lateinit var textNavigationParam: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation_params)

        textNavigationParam = findViewById(R.id.text_navigation_param)

        val extras = intent.extras
        if (extras != null) {
            val value = extras.getSerializable("serializable") as User
            textNavigationParam.text = value.email
        }
    }
}