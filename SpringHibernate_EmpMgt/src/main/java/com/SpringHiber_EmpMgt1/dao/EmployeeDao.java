package com.SpringHiber_EmpMgt1.dao;

import java.util.List;

import com.SpringHiber_EmpMgt1.entities.Employee;

public interface EmployeeDao {

	public int insertEmployee(Employee emp);

	public int updateEmployee(int eid,String ename,String contact);

	public int deleteEmployee(Employee emp);

	public Employee getEmployee(int eid);

	public List<Employee> getAllEmployee();
}
