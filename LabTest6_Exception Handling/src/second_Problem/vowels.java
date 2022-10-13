package second_Problem;

import java.util.Scanner;

public class vowels  //main class
{

	public static int countVowels(String input) throws Exception 
	{
	    input = input.toLowerCase();  //convert string to lowercase
	    char[] chars = input.toCharArray();  //converting string to character array

	    int count = 0;
	    for (int i = 0; i < chars.length; i++)

	    {   //vowels are a,e,i,o,u
	    	 if (chars[i] == 'a' || chars[i] == 'e' || chars[i] == 'i' || chars[i] == 'o' || chars[i] == 'u') 
	        {
	        	  count++;   //Number of vowels
	        } 
	        
	    }
		   System.out.println("Number of Vowels are :"+count);
		   
		   for(char d:chars)
			   if (d == 'x')  //to check string contain x or not
	        {
	            throw new Exception("The array contains the letter 'x'.");
	        }
	      return count;

	}
	
	
	
	
	     //main method
	
	public static void main(String[] args) 
	{
     
		 new vowels();
		 
		//taking input from user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String :");
		String input=scan.nextLine();
		
		//calling countVowels method in try catch block as it throws exception 
	     
		try
		{
			vowels.countVowels(input);
		} 
		catch (Exception e) 
		{
			System.out.println(" "+e);
		}
		
		scan.close();  //clossing the Scanner
	}

}
