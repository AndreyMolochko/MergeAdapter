package com.article.mergeadapter.oldversion.repositories

import com.article.mergeadapter.oldversion.models.ListItem

class EmployeesRepository {
    fun getEmployees() = arrayOf(
        ListItem.Employee(0, "Senior Software Engineer"),
        ListItem.Employee(1, "Software Engineer"),
        ListItem.Employee(2, "Senior Quality Assurance Engineer"),
        ListItem.Employee(3, "Quality Assurance Engineer"),
        ListItem.Employee(4, "Group Manager"),
        ListItem.Employee(5, "CEO"),
        ListItem.Employee(6, "Lead Software Engineer"),
        ListItem.Employee(7, "HR Manager"),
        ListItem.Employee(8, "Technical Support Engineer")
    )
}