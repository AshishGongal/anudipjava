package thirdProblem;

import java.io.Serializable;

public class Students implements Serializable
{
	private String name;
	private Long contact;
	private String id;
	
	public Students(String name, Long contact, String id) 
	{
		super();
		this.name = name;
		this.contact = contact;
		this.id = id;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getContact() {
		return contact;
	}

	public void setContact(Long contact) {
		this.contact = contact;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}


	
	
	
	
}
