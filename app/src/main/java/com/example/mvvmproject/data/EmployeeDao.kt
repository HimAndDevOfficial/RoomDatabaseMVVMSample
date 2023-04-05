package com.example.mvvmproject.data

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.mvvmproject.model.Employee

@Dao
interface EmployeeDao {

    @Insert
   suspend fun addEmployee(employee: Employee)

    @Update
   suspend fun updateEmployee(employee: Employee)

    @Delete
   suspend fun deleteEmployee(employee: Employee)

    @Query("SELECT * from employee_table")
    fun readAllData() : LiveData<List<Employee>>


}