package com.app.basicrecyclerview_employee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var employeeRecycler:RecyclerView
    var employeeList= mutableListOf<Employee>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
            setupList()


    }

    private fun setUpRecycler(){

        employeeRecycler=findViewById(R.id.rvEmployee)
        employeeRecycler.adapter=EmployeeAdapter(employeeList)
        employeeRecycler.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
    }

    private fun setupList(){
        for (i in 0..30){
            employeeList.add(i,Employee(R.drawable.round_person_24,"Mark Zuckerberg","System Engineer"))
        }
        setUpRecycler()
    }
}