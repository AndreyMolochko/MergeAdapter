package com.article.mergeadapter.oldversion.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.article.mergeadapter.R
import com.article.mergeadapter.oldversion.models.ListItem

class MainAdapter(var itemsList: List<ListItem>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val TYPE_HEADER = 0
    private val TYPE_CONTENT = 1

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            TYPE_HEADER -> {
                HeaderViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.recycler_header, parent, false))
            }
            else -> {
                ContentViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.recycler_item, parent, false))
            }
        }
    }

    override fun getItemCount(): Int = itemsList.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (itemsList[position]) {
            is ListItem.User -> {
                (holder as HeaderViewHolder).bind(itemsList[position] as ListItem.User)
            }
            is ListItem.Employee -> {
                (holder as ContentViewHolder).bind(itemsList[position] as ListItem.Employee)
            }
        }
    }

    override fun getItemViewType(position: Int): Int {
        return when (itemsList[position]) {
            is ListItem.User -> TYPE_HEADER
            is ListItem.Employee -> TYPE_CONTENT
        }
    }

    class HeaderViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(user: ListItem.User) {
            itemView.findViewById<TextView>(R.id.recycler_header_name_text_view).text = user.name
            itemView.findViewById<TextView>(R.id.recycler_header_surname_text_view).text = user.lastname
            itemView.findViewById<ImageView>(R.id.recycler_header_avatar_image_view).setImageResource(user.avatar)
        }
    }

    class ContentViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(employee: ListItem.Employee) {
            itemView.findViewById<TextView>(R.id.recycler_item_position_text_view).text = employee.position
        }
    }
}