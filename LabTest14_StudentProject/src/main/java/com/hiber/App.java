package com.hiber;

import java.util.Scanner;

import com.hiber.daoimpl.StudentDaoImpl;
import com.hiber.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 StudentDaoImpl sdao=new StudentDaoImpl();
         //below are choices to user to execute the queries
    	 System.out.println("press 1 to insert Student");
		 System.out.println("press 2 to see Student details");
		 System.out.println("press 3 to delete Student details");
		 System.out.println("press 4 to update ");
 		Scanner sc = new Scanner(System.in);
 		Student stud;
 		int i = sc.nextInt();
 		switch (i) {
 		
		//case 1 for to insert student details
 		case 1:{
            stud=new Student();
			System.out.println("Enter student name to add: ");
			String sname = sc.next();
            stud.setSname(sname);
			System.out.println("Enter student contact to add: ");
			String contact = sc.next();
           stud.setContact(contact);
           sdao.insertStudent(stud);
 		  }
 			break;
			//case 2 for displaying all student details
 		case 2:{
 				System.out.println("Enter student id to display the student details: ");
 				int id=sc.nextInt();
 				stud=sdao.getStudent(id);
 				System.out.println(stud);
 			}
 			break;
			//case 3 for deleting the student details
 			case 3:{
 					System.out.println("Enter student id to delete the student details: ");
 					int id=sc.nextInt();
 					sdao.deleteStudent(id);
 				}
 				break;
 				
 			//case 4 for  updating the student details
 		case 4:{
 			System.out.println("Enter Id to be updated");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter new student name :");
			String sname = sc.nextLine();
 			sdao.updateStudent(id,sname);

 			}break;
 		default:System.out.println(" Enter a valid number...!!");

 			sc.close();
 			
 		}
 	}
 
  }

