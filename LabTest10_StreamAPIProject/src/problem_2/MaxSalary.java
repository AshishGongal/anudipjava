package problem_2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import problem_1.Employees;

public class MaxSalary 
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
        
	     
        //Finding Employee having Maximum salary
        double max=employeeList.stream().map(x->x.getSalary()).max(Double::compare).get();  
        System.out.println("Highest salary: "+max);  
          
        //printing Employee name whose salary is maximum
        String name=employeeList.stream().filter(x->x.getSalary()==max).map(x->x.getName())  
                        .collect(Collectors.joining());  
        System.out.println("Employee name: "+name);  
          
        //printing Employee Department whose salary is maximum

        String dept=employeeList.stream().filter(x->x.getSalary()==max).map(x->x.getDepartment())  
                        .collect(Collectors.joining());  
        System.out.println("Department: "+dept);
     }

	//Main Method
	public static void main(String[] args)
	{
		fillEmployeesList();
	}

}
