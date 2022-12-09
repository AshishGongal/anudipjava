package com.hiber.daoimpl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hiber.entities.Student;
import com.hiber.hiberutil.HiberUtil;

public class StudentDaoImpl extends Student {

	static Session session=HiberUtil.getSession();
    Transaction tx;
    //method to insert student details
	public void insertStudent(Student st) {
		tx=session.beginTransaction();
		session.save(st);
		tx.commit();
	}
     //method to view all student details
	public static Student getStudent(int id) {
		return session.get(Student.class, id);
	}
     //method to delete student details
	public static boolean deleteStudent(int id) {
		Transaction tx = session.beginTransaction();
		Student st = session.get(Student.class, id);
		session.delete(st);
		tx.commit();
		session.close();
		return true;
	}
  //method to update student details
	public boolean updateStudent(int id,String name) {
		tx=session.beginTransaction();
		Student s1=session.get(Student.class, id);
		s1.setSname(name);;
		session.update(s1);
		tx.commit();
		session.close();
		return false;
	}
}
