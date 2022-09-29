package Third_Problem;

public class Employee extends Member
{ 	
	private String specialization;
	
	public Employee(String name, int age, String phoneNumber, String address, double salary) 
	{
		super(name, age, phoneNumber, address, salary);
	}


	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

}
