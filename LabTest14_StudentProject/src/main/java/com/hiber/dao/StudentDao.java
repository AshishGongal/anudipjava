package com.hiber.dao;

import com.hiber.entities.Student;

public interface StudentDao {

	//abstract StudentDao interface method

	//to insert the student details
	void insertStudent(Student stud);
	//to view student details
	Student getStudent(int id);
	//to delate a student details
	boolean deleteStudent(int id);
	//to update student details
	boolean updateStudent(int id,String sname);
}
