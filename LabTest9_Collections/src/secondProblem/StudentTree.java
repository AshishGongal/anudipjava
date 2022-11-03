package secondProblem;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;


public class StudentTree
{

	public static void fillStudentList()
	{
		//Student Array list 1
		
		 TreeSet<Student> list1 = new TreeSet<Student>();
		 
		list1.add(new Student(101,"Krishna","123456789"));
		list1.add(new Student(102,"Akshay","123456987"));
		list1.add(new Student(103,"Rohit","55667896121"));

		//Student Array list 2
		
		 TreeSet<Student> list2 = new TreeSet<Student>();
		list2.add(new Student(104,"Lankesh","12345678955"));
		list2.add(new Student(105,"Ram","7894561230"));
		list2.add(new Student(106,"Gaurav","1478523690"));
		
		//adding ArrayList1 to Arraylist2
	    list2.addAll(list1);
	    
	    // Display the elements in the TreeSet
	    
	    	Iterator itr=list2.iterator();
	    	while(itr.hasNext())
	    	{
			System.out.println(itr.next()+"\n");
	    	}
	 
	      // Get the number of elements in the TreeSet
	    	int size = list2.size();
	    	System.out.println("The size of the TreeSet is: " + size);
	 
	      // Get the first and last elements of the TreeSet
	    	Object first = ((SortedSet<Student>) list2).first();
	    	Object last = ((SortedSet<Student>) list2).last();
	    	System.out.println("The first element of the TreeSet is: " + first);
	    	System.out.println("The last element of the TreeSet is: " + last);
	    
	}
	
	//main method
	public static void main(String[] args)
	{
		fillStudentList();
	}

}
