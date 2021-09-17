package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CardAdapter(private val mList: List<ItemsViewModel>): RecyclerView.Adapter<CardAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_view_design, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardAdapter.ViewHolder, position: Int) {
        val ItemsViewModel = mList[position]


        holder.imageView.setImageResource(ItemsViewModel.image)

        holder.textView.text = ItemsViewModel.text
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val imageView: ImageView = itemView.findViewById(R.id.image_card)
        val textView: TextView = itemView.findViewById(R.id.text_card)
    }
}