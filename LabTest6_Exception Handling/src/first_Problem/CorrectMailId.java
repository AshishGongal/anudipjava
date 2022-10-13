package first_Problem;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CorrectMailId
{
	//method to validate Email
	public static void validateEmail_id() throws InvalidMailException 
	{
		String email;
		Scanner sc=new Scanner(System.in); //email taking from user
		System.out.println("Enter the Email Id :");
		email=sc.nextLine();
        sc.close(); //clossing Scanner
        
		// regular expression for matching pattern
		boolean b=Pattern.matches("[a-zA-Z0-9]+@[a-zA-Z]+\\.(com|in)", email);
		
			//condition to throw exception
			if (b==false) 
			{
				throw new InvalidMailException();
			}
			System.out.println("Valid Email Id : "+email);

		} 
}
