package com.article.mergeadapter.newversion.repositories

import com.article.mergeadapter.newversion.models.Employee

class EmployeesRepository {
    fun getEmployees() = listOf(
        Employee(0, "Senior Software Engineer"),
        Employee(1, "Software Engineer"),
        Employee(2, "Senior Quality Assurance Engineer"),
        Employee(3, "Quality Assurance Engineer"),
        Employee(4, "Group Manager"),
        Employee(5, "CEO"),
        Employee(6, "Lead Software Engineer"),
        Employee(7, "HR Manager"),
        Employee(8, "Technical Support Engineer")
    )
}