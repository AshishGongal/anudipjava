package com.SpringHiber_EmpMgt1.daoimpl;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.SpringHiber_EmpMgt1.dao.EmployeeDao;
import com.SpringHiber_EmpMgt1.entities.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	private HibernateTemplate ht;

	// To update record of employee
    @Transactional
	@Override
	public int insertEmployee(Employee emp) {
		ht.save(emp);
		return 1;
	}

 // To update record of employee
 	@Transactional
	@Override
	public int updateEmployee(int eid,String ename,String contact) {
 		ht.update(ename,contact);
		return 1;
	}

 // To delete record of employee
  	@Transactional
	@Override
	public int deleteEmployee(Employee emp) {
		ht.delete(emp);
		return 1;
	}

	// To get specific record
	@Override
	public Employee getEmployee(int eid) {
		Employee emp = ht.get(Employee.class, eid);
		return emp;
	}

	// To get all records
	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> empList = ht.loadAll(Employee.class);
		return empList;
	}

}
