package problem_1;


//POJO class of employees
public class Employees
{
	private String name;
	private int age;
	private String department;
	private int salary;
	
	
	//default constructor
	public Employees() {
		super();
	}
	
	//parameterise constructor
	public Employees(String name, int age, String department, int salary) 
	{
		super();
		this.name = name;
		this.age = age;
		this.department = department;
		this.salary = salary;
		
	}

	//Getter&Setter Method
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	
	//To string Method
	@Override
	public String toString()
	{
		System.out.println("Name :"+name);
		System.out.println("Age  :"+age);
		System.out.println("Department :"+department);
		System.out.println("Salary :"+salary);


		return 		"";

	}
	
	

	
	
	
	
	
}
