package com.article.mergeadapter.oldversion.models

sealed class ListItem {
    class User(var id: Int, var avatar: Int, var name: String, var lastname: String) : ListItem()

    class Employee(var id: Int, var position: String) : ListItem()
}