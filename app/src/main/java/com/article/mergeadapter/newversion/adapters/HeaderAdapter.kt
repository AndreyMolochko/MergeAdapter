package com.article.mergeadapter.newversion.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.article.mergeadapter.R
import com.article.mergeadapter.newversion.models.User

class HeaderAdapter(var usersList: List<User>) : RecyclerView.Adapter<HeaderAdapter.HeaderViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeaderViewHolder =
        HeaderViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.recycler_header, parent, false))

    override fun getItemCount(): Int = usersList.size

    override fun onBindViewHolder(holder: HeaderViewHolder, position: Int) = holder.bind(usersList[position])

    class HeaderViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(user: User) {
            itemView.findViewById<TextView>(R.id.recycler_header_name_text_view).text = user.name
            itemView.findViewById<TextView>(R.id.recycler_header_surname_text_view).text = user.lastname
            itemView.findViewById<ImageView>(R.id.recycler_header_avatar_image_view).setImageResource(user.avatar)
        }
    }
}