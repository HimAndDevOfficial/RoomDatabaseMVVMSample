package com.example.mvvmproject.fragments.show

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvmproject.R
import com.example.mvvmproject.model.Employee


class ShowListAdapter: RecyclerView.Adapter<ShowListAdapter.ViewHolder>() {

    private var employeeList= emptyList<Employee>()
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val firstName: TextView = view.findViewById(R.id.first_name)
        val lastName: TextView = view.findViewById(R.id.last_name)
        val age: TextView = view.findViewById(R.id.age)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_row, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return employeeList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       holder.firstName.text = employeeList.get(position).firstName.toString()
        holder.lastName.text = employeeList.get(position).lastName.toString()
        holder.age.text =employeeList.get(position).age.toString()
    }

    fun setData(employee: List<Employee>) {
        this.employeeList= employee
        notifyDataSetChanged()
    }
}