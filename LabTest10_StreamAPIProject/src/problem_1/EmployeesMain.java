package problem_1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeesMain 
{
	public static void fillEmployeesList()
	{
		//Creating arraylist & Adding object in arraylist    
		  List<Employees> employeeList = new ArrayList<>();
		    employeeList.add(new Employees("Nilesh", 22, "IT", 90000));
	        employeeList.add(new Employees("Sahel", 23, "HR", 10000));
	        employeeList.add(new Employees("Akshay", 24, "Testing", 8000));
	        employeeList.add(new Employees("Rohit", 25, "R&D", 75000));
	        employeeList.add(new Employees("Lankesh", 26, "Marketing", 50000));
	        employeeList.add(new Employees("Mahesh", 27, "Finance", 7500));
	        
        //List sorted on their Name 
        Collections.sort(employeeList, (e1, e2) -> {
        	return e1.getName().compareTo(e2.getName());});
        
         System.out.println( employeeList);
         
  }
	
	
	//Main Method
	public static void main(String[] args) 
	{
		fillEmployeesList();
	}

}
