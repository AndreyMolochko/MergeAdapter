package com.article.mergeadapter.oldversion.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.article.mergeadapter.R
import com.article.mergeadapter.oldversion.adapters.MainAdapter
import com.article.mergeadapter.oldversion.models.ListItem
import com.article.mergeadapter.oldversion.repositories.EmployeesRepository
import com.article.mergeadapter.oldversion.repositories.UsersRepository

class OldVersionActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var mainAdapter: MainAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initAdapter()
        initViews()
    }

    private fun initViews() {
        recyclerView = findViewById(R.id.main_recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = mainAdapter
    }

    private fun initAdapter() {
        val userRepository = UsersRepository()
        val employeesRepository = EmployeesRepository()
        val itemsList: List<ListItem> = listOf(userRepository.getUser(), *employeesRepository.getEmployees())
        mainAdapter = MainAdapter(itemsList)
    }
}