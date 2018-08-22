package com.taurus.fragmenttoolbarmanager

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class DessertAdapter(context: Context) : RecyclerView.Adapter<DessertAdapter.DessertVh>() {

    private var desserts = listOf<Dessert>()

    init {

        desserts = Dessert.prepareDesserts(
                context.resources.getStringArray(R.array.dessert_names),
                context.resources.getStringArray(R.array.dessert_descriptions)
        )
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DessertVh {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_dessert, parent, false)
        return DessertAdapter.DessertVh(view)
    }

    override fun onBindViewHolder(holder: DessertVh, position: Int) {
        val dessert = desserts[position]

        holder.name.text = dessert.name
        holder.description.text = dessert.description
        holder.firstLetter.text = dessert.firstLetter

    }

    override fun getItemCount(): Int {
        return desserts.size
    }

    class DessertVh(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val name: TextView = itemView.findViewById(R.id.txt_name)
        val description: TextView = itemView.findViewById(R.id.txt_desc)
        val firstLetter: TextView = itemView.findViewById(R.id.txt_firstletter)

    }
}
