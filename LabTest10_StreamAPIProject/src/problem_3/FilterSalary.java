package problem_3;

import java.util.ArrayList;
import java.util.List;

import problem_1.Employees;

public class FilterSalary 
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
        
        //No of Employees whose salary is greter than 10000 using stream API
        
        long count = employeeList.stream().filter(e -> e.getSalary() > 10000).count();
		System.out.println("\nTotal no of emp whose salary is greater than 10000 is " + count);

		//List of Employee whose salary greter than 10000
		System.out.println("\nEmployees whose salary is greater than 10000 are ");
		employeeList.stream().filter(e -> e.getSalary() > 10000).forEach(System.out::println);
		
		
		
     }

	//Main Method
	public static void main(String[] args)
	{
		fillEmployeesList();
	}

}
