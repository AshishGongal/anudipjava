// Write a program to count the total number of vowels and consonants present in the given string.


import java.util.Scanner;
public class VowConsCount 
{

	static void  countVowCons(String str)
	{
       //Counter variable to store the count of vowels and consonant    
      //Initialize elements with zero
     //as till now we have not traversed
		int vCount=0,cCount=0;

		
       //Converting entire string to lower case    
		str = str.toLowerCase();  
		
		for(int i = 0; i < str.length(); i++) 
		{  
            //Checks whether a character is a vowel  
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') 
            {  
                vCount++;   //Increments the vowel counter  

            }  
            
           //Checks whether a character is a consonant  
            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z')
            {    
                cCount++;    //Increments the consonant counter  
 
            }  
        }  
		// Print and display number of vowels and consonants
        // on console
            System.out.println("Number of vowels: " + vCount);  
            System.out.println("Number of consonants: " + cCount);  
    } 
	
	//Main Method
	
	public static void main(String[] args) 
	{
		VowConsCount VowCons = new VowConsCount();
		//taking input from user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str=scan.nextLine();
		
		//calling countVowCons method
		VowCons.countVowCons(str);
		


	}

}
