package com.app.basicrecyclerview_employee

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class EmployeeAdapter(val empList:List<Employee>):RecyclerView.Adapter<EmployeeAdapter.employeeViewHolder>(){

    inner class employeeViewHolder(itemView: View):ViewHolder(itemView){

        val empProfilePic=itemView.findViewById<ImageView>(R.id.ivEmployee)
        val empName=itemView.findViewById<TextView>(R.id.tvEmpName)
        val empRoll=itemView.findViewById<TextView>(R.id.tvEmpRoll)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): employeeViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.item_recycler_emp,parent,false)
        return employeeViewHolder(view)
    }

    override fun getItemCount(): Int {
        return empList.size
    }

    override fun onBindViewHolder(holder: employeeViewHolder, position: Int) {
       val item=empList[position]
        holder.empName.text=item.empName
        holder.empRoll.text=item.empRoll
        holder.empProfilePic.setImageResource(item.empProfilePic)
    }
}