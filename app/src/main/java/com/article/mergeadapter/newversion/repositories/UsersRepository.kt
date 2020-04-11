package com.article.mergeadapter.newversion.repositories

import com.article.mergeadapter.R
import com.article.mergeadapter.newversion.models.User

class UsersRepository {
    fun getUser() = User(0, R.drawable.ic_launcher_background, "Name", "Surname")
}