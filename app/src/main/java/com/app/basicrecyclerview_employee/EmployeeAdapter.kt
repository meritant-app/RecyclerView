package com.app.basicrecyclerview_employee

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class EmployeeAdapter(private val empList: List<Employee>) :
    RecyclerView.Adapter<EmployeeAdapter.EmployeeViewHolder>() {

    inner class EmployeeViewHolder(itemView: View) : ViewHolder(itemView) {

        private val empProfilePic: ImageView = itemView.findViewById(R.id.ivEmployee)
        private val empName: TextView = itemView.findViewById(R.id.tvEmpName)
        private val empRoll: TextView = itemView.findViewById(R.id.tvEmpRoll)

        fun bind(item: Employee) {
            empName.text = item.empName
            empRoll.text = item.empRoll
            empProfilePic.setImageResource(item.empProfilePic)

        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmployeeViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_recycler_emp, parent, false)
        return EmployeeViewHolder(view)
    }

    override fun getItemCount(): Int {
        return empList.size
    }

    override fun onBindViewHolder(holder: EmployeeViewHolder, position: Int) {
        val item = empList[position]
        holder.bind(item)
    }
}