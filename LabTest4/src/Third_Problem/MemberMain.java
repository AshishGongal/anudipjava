package Third_Problem;

public class MemberMain 
{

	public static void main(String[] args) 
	{
		System.out.println("Employee Details : ");
		Employee e=new Employee(null, 0, null, null, 0);

		//setting details of employee
		e.setName("Ashish Gongal");
		e.setAge(22);
		e.setPhoneNumber("1234567890");
		e.setAddress(" Chandrapur");
		e.setSalary(45000);
		e.setSpecialization("Web Development");

		//getting details of employee
		System.out.println("Name : "+e.getName());
		System.out.println("Age : "+e.getAge());
		System.out.println("Phone No. : "+e.getPhoneNumber());
		System.out.println("Address : "+e.getAddress());
		System.out.println("Specialization : "+e.getSpecialization());
		e.printsalary();

		System.out.println("\nManager Details : ");
		Manager m=new Manager(null, 0, null, null, 0);

		//setting details of manager
		m.setName("Kabeer Patil");
		m.setAge(21);
		m.setPhoneNumber("9130160220");
		m.setAddress("Nagpur");
		m.setSalary(95000);
		m.setDepartment("R&D ");

		//getting details of manager
		System.out.println("Name : "+m.getName());
		System.out.println("Age : "+m.getAge());
		System.out.println("Phone No. : "+m.getPhoneNumber());
		System.out.println("Address : "+m.getAddress());
		System.out.println("Department : "+m.getDepartment());
		m.printsalary();
	}

}
