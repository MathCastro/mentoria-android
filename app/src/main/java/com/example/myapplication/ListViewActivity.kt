package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class ListViewActivity : AppCompatActivity() {
    private lateinit var userListView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        userListView = findViewById(R.id.user_listview)

        val userList = mountUserList()

        val listItems = arrayOfNulls<String>(userList.size)

        for (i in 0 until userList.size) {
            val user = userList[i]
            listItems[i] = user.email
        }

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listItems)
        userListView.adapter = adapter
    }

    private fun mountUserList(): MutableList<User> {
        val users: MutableList<User> = mutableListOf()
        for (i in 0..5000) {
            users.add(User(email = "email$i@email.com"))
        }

        return users
    }


}