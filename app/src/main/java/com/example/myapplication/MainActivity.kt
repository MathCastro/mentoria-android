package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private lateinit var buttonLayout: Button
    private lateinit var buttonNavigationParams: Button
    private lateinit var buttonListView: Button
    private lateinit var lifecycleButton: Button
    private lateinit var loginButton: Button
    private lateinit var recyclerButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonLayout = findViewById(R.id.buttonLayout)
        buttonNavigationParams = findViewById(R.id.buttonNavigationParams)
        buttonListView = findViewById(R.id.button_listview)
        lifecycleButton = findViewById(R.id.lifecicle_button)
        loginButton = findViewById(R.id.login_button)
        recyclerButton = findViewById(R.id.recycler_button)

        buttonLayout.setOnClickListener {
            val intent = Intent(this, LayoutActivity::class.java)
            startActivity(intent)
        }
        buttonNavigationParams.setOnClickListener {
            var user: User = User(email = "teste@teste.com")
            val intent = Intent(this, NavigationParamsActivity::class.java)
            intent.putExtra("key", "Mentoria Carrefour")
            intent.putExtra("serializable", user)
            startActivity(intent)
        }

        buttonListView.setOnClickListener {
            val intent = Intent(this, ListViewActivity::class.java)
            startActivity(intent)
        }

        lifecycleButton.setOnClickListener {
            val intent = Intent(this, LifecycleActivity::class.java)
            startActivity(intent)
        }

        loginButton.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        recyclerButton.setOnClickListener {
            val intent = Intent(this, RecyclerActivity::class.java)
            startActivity(intent)
        }

    }

}