package com.article.mergeadapter.newversion.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.article.mergeadapter.R
import com.article.mergeadapter.newversion.models.Employee

class ContentAdapter(var employeesList: List<Employee>) : RecyclerView.Adapter<ContentAdapter.ContentViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContentViewHolder =
        ContentViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.recycler_item, parent, false))

    override fun getItemCount(): Int = employeesList.size

    override fun onBindViewHolder(holder: ContentViewHolder, position: Int) = holder.bind(employeesList[position])

    class ContentViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(employee: Employee) {
            itemView.findViewById<TextView>(R.id.recycler_item_position_text_view).text = employee.position
        }
    }
}