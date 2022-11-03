package firstProblem;

public class Student 
{
	//objects of student
	private String sId;
	private String name;
	private String contact;
	
	//Default Constructor
	public Student() {
		super();
	}

	//Paramererized Constructor
	public Student(String sId, String name, String contact) {
		super();
		this.sId = sId;
		this.name = name;
		this.contact = contact;
	}

	
	//Getter Setter method
	public String getsId() {
		return sId;
	}

	public void setsId(String sId) {
		this.sId = sId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	
	//to string method
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", name=" + name + ", contact=" + contact + "]";
	}
	
	
	
}
