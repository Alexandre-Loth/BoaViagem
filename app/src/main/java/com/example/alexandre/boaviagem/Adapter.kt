package com.example.alexandre.boaviagem

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ViagensAdapter (val dataSet: List<NovaViagem>) : RecyclerView.Adapter<NovaViagemViewHolder>(){
    override fun onBindViewHolder(holder: NovaViagemViewHolder, position: Int) {
        holder.bindView( dataSet .get(position))
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NovaViagemViewHolder {
        val view = LayoutInflater.from(parent. context ).inflate(R.layout.fragment_minhas_viagens ,parent, false )
        return NovaViagemViewHolder(view)
    }

}