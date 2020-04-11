package com.article.mergeadapter.oldversion.repositories

import com.article.mergeadapter.R
import com.article.mergeadapter.oldversion.models.ListItem

class UsersRepository {
    fun getUser() = ListItem.User(0, R.drawable.ic_launcher_background, "Name", "Surname")
}