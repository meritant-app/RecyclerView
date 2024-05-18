package com.app.basicrecyclerview_employee

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.app.basicrecyclerview_employee.databinding.ItemRecyclerEmpBinding

class EmployeeAdapter :
    androidx.recyclerview.widget.ListAdapter<Employee, EmployeeAdapter.EmployeeViewHolder>(
        EmployeeDiffCallback()
    ) {

    inner class EmployeeViewHolder(private val binding: ItemRecyclerEmpBinding) :
        ViewHolder(binding.root) {


        fun bind(item: Employee) {
            binding.employee=item
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmployeeViewHolder {
        val binding = ItemRecyclerEmpBinding.inflate(LayoutInflater.from(parent.context))
        return EmployeeViewHolder(binding)
    }


    override fun onBindViewHolder(holder: EmployeeViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }
}

class EmployeeDiffCallback : DiffUtil.ItemCallback<Employee>() {
    override fun areItemsTheSame(oldItem: Employee, newItem: Employee): Boolean {
        return oldItem.empName == newItem.empName
    }

    override fun areContentsTheSame(oldItem: Employee, newItem: Employee): Boolean {
        return oldItem == newItem
    }


}