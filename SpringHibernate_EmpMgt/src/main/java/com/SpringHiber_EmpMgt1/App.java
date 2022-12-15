package com.SpringHiber_EmpMgt1;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringHiber_EmpMgt1.dao.DepartmentDao;
import com.SpringHiber_EmpMgt1.dao.EmployeeDao;
import com.SpringHiber_EmpMgt1.entities.Department;
import com.SpringHiber_EmpMgt1.entities.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//one department have many employee
    	
    	
    	ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeDao edao=(EmployeeDao) ac.getBean("empdao");

		Employee emp =new Employee(001,"Ashish","9865123210");
		Employee emp1 =new Employee(002,"Shrihari","8954512321");		
		Employee emp2 =new Employee(003,"Prachi","9845623210");
		Employee emp3 =new Employee(004,"Neha","9801123210");

		edao.insertEmployee(emp);
		edao.insertEmployee(emp1);
		edao.insertEmployee(emp2);
		edao.insertEmployee(emp3);
		
    	List addlist = List.of(emp,emp1,emp2,emp3);

		
    	DepartmentDao ddao = (DepartmentDao) ac.getBean("dptdao");
		Department dept = new Department();
		dept.setDeptId(101);
		dept.setDeptName("Developer");
		dept.setAddlist(addlist);
		
		  ddao.insertDepartment(dept); 
		 
		// emp = edao.getEmployee(100);

		  int i=edao.updateEmployee(002,"rohit", "1234567890");
			System.out.println(i+" book successfully updated");

		// ddao.deleteDepartment(emp1);

		List<Employee> elist = edao.getAllEmployee();

		System.out.println(elist);
    }
}
