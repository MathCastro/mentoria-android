package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)

        recyclerView.layoutManager = LinearLayoutManager(this)

        val data = ArrayList<ItemsViewModel>()

        for (i in 1..5000) {
            data.add(ItemsViewModel(R.drawable.welcome, "Item $i"))
        }

        val adapter = CardAdapter(data)

        recyclerView.adapter = adapter
    }
}