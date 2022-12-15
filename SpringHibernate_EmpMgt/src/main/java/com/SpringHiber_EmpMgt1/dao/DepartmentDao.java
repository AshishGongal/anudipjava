package com.SpringHiber_EmpMgt1.dao;

import java.util.List;

import com.SpringHiber_EmpMgt1.entities.Department;

public interface DepartmentDao {

	public int insertDepartment(Department dept);

	public int updateDepartment(Department dept);

	public int deleteDepartment(Department dept);

	public Department getDepartment(int id);

	public List<Department> getAllDepartments();
}
