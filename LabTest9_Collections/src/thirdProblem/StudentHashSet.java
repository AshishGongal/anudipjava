package thirdProblem;

import java.util.HashSet;
import java.util.Iterator;

import secondProblem.Student;

public class StudentHashSet 
{

	public static void main(String[] args) 
	{
		//Creating HashSet and adding elements 
		 HashSet<Student> set = new HashSet<>();
	      set.add(new Student(101, "Abhishek","7965412301"));
	      set.add(new Student(102, "Akshay","8701234598"));
	      set.add(new Student(103, "Mukesh","8794563210"));
	      set.add(new Student(104, "Suresh","7895463210"));
	      set.add(new Student(105, "Sarth","9874563210"));
	      
	      Iterator<Student> it = set.iterator();
	      while (it.hasNext())
	      {
	         Student s = it.next();
	         //to print name of students whose id is greater than 103
	         if (s.getsId() > 103) 
	         {
	            System.out.println(s.getName());
	         }
	      }
	}

}
