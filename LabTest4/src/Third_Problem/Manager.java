package Third_Problem;

public class Manager extends Member 
{		
	private String department;

	public Manager(String name, int age, String phoneNumber, String address, double salary) 
	{
		super(name, age, phoneNumber, address, salary);
	}


	
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	



}
