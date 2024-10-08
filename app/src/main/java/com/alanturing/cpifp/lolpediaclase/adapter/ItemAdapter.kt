package com.alanturing.cpifp.lolpediaclase.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.alanturing.cpifp.lolpediaclase.R
import com.alanturing.cpifp.lolpediaclase.model.Champion

class ItemAdapter(private val context:Context,
                  private val dataset: List<Champion>):RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
    class ItemViewHolder(private val view: View):RecyclerView.ViewHolder(view){
        val imageView: ImageView = view.findViewById<ImageView>(R.id.champion_picture)
        val textView: TextView = view.findViewById<TextView>(R.id.champion_name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    override fun getItemCount() = dataset.size

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val champion = dataset[position]
        holder.textView.text = context.getString(champion.championStringID)
        holder.imageView.setImageDrawable(context.getDrawable(champion.championImageID))
    }
}