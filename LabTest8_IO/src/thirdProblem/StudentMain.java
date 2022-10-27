package thirdProblem;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StudentMain 
{

	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		FileOutputStream fos = new FileOutputStream("F:\\Ashish\\student.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		//creating object of student class
		Students s1 = new Students("Ashish",1234567890L,"STU001");
		Students s2 = new Students("Sahil",7894561230L,"STU002");
		Students s3 = new Students("Akshay",1478523690L,"STU003");
		
		//writing object in file
		oos.writeObject(s1);
		oos.writeObject(s2);
		oos.writeObject(s3);
		oos.close();
		System.out.println(" Writing done!");

		
		//reading object from file
		FileInputStream fis = new FileInputStream("F:\\Ashish\\student.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Students s= null;
		while (fis.available() > 0) 
		{
			s = (Students) ois.readObject();
			if (s.getName().startsWith("A")) //check wether name start with Ar not
			{
				System.out.println(s);  //print name start with A
			}
		}
		ois.close();
		

		
	}

}
