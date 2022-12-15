package com.SpringHiber_EmpMgt1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringHiber_EmpMgt1.dao.DepartmentDao;
import com.SpringHiber_EmpMgt1.entities.Department;

public class DepartmentTest {

	static DepartmentDao ddao;

	@BeforeAll
	public static void init() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		ddao = (DepartmentDao) ac.getBean("dptdao");
	}

	@Test
	public void testGetDepartment() {
		// negative case
		Department dept = ddao.getDepartment(100);
		assertEquals(001, dept.getDeptId());
	}

	@Test
	public void testUpdateDepartment() {
		// positive case
		Department dept = ddao.getDepartment(100);
		dept.setDeptName("Training");
		assertEquals(1, ddao.updateDepartment(dept));
	}

}
