package com.article.mergeadapter.newversion.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.MergeAdapter
import androidx.recyclerview.widget.RecyclerView
import com.article.mergeadapter.R
import com.article.mergeadapter.newversion.adapters.ContentAdapter
import com.article.mergeadapter.newversion.adapters.HeaderAdapter
import com.article.mergeadapter.newversion.repositories.EmployeesRepository
import com.article.mergeadapter.newversion.repositories.UsersRepository

class NewVersionActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var mergeAdapter: MergeAdapter
    private lateinit var headerAdapter: HeaderAdapter
    private lateinit var contentAdapter: ContentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initAdapters()
        initViews()
    }

    private fun initViews() {
        recyclerView = findViewById(R.id.main_recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = mergeAdapter
    }

    private fun initAdapters() {
        val userRepository = UsersRepository()
        val employeesRepository = EmployeesRepository()
        headerAdapter = HeaderAdapter(listOf(userRepository.getUser()))
        contentAdapter = ContentAdapter(employeesRepository.getEmployees())
        mergeAdapter = MergeAdapter(headerAdapter, contentAdapter)
    }
}
