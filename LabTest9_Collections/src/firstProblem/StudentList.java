package firstProblem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class StudentList 
{

	public static void fillStudentList()
	{
		//Student Array list 1
		
		ArrayList<Student> list1=new ArrayList<>();
		list1.add(new Student("STU001","Krishna","123456789"));
		list1.add(new Student("STU002","Akshay","123456987"));
		list1.add(new Student("STU003","Rohit","55667896121"));

		//Student Array list 2
		
		ArrayList<Student> list2=new ArrayList<>();
		list2.add(new Student("STU004","Lankesh","12345678955"));
		list2.add(new Student("STU005","Ram","7894561230"));
		list2.add(new Student("STU006","Gaurav","1478523690"));
		
		//adding ArrayList1 to Arraylist2
	    list2.addAll(list1);
	
	
   
		//Sorting elements on the basis of Name
	     System.out.println("Sorting by Name");
	     Collections.sort(list2,new NameComparator());
			   
	     Iterator itr=list2.iterator();
			    
			   while(itr.hasNext())
			   {
				   System.out.println(itr.next());
			   }
			   
		
		  //Sorting elements on the basis of Student id
			     System.out.println("\nSorting by Student Id");

			    Collections.sort(list2,new SIdComparator());
			   
			     Iterator itr2=list2.iterator();
					    
					   while(itr2.hasNext())
					   {
						   System.out.println(itr2.next());
					   }
			   
		}
	
	
	//main method
	public static void main(String[] args) 
	{
		fillStudentList();
	}

}
