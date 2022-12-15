package com.SpringHiber_EmpMgt1.daoimpl;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.SpringHiber_EmpMgt1.dao.DepartmentDao;
import com.SpringHiber_EmpMgt1.entities.Department;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class DepartmentDaoImpl implements DepartmentDao {

	private HibernateTemplate ht;

	// To insert record of department
	@Transactional
	public int insertDepartment(Department dept) {
		ht.save(dept);
		return 1;

	}

	// To update record of department
	@Transactional
	public int updateDepartment(Department dept) {
		ht.update(dept);
		return 1;

	}

	// To delete record of department
	@Transactional
	public int deleteDepartment(Department dept) {
		ht.delete(dept);
		return 1;

	}

	// To get specific record
	public Department getDepartment(int id) {

		Department dept = ht.get(Department.class, id);
		return dept;

	}

	// To get all records
	public List<Department> getAllDepartments() {

		List<Department> deptList = ht.loadAll(Department.class);
		return deptList;
	}

}
