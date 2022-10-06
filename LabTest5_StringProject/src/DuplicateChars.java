// Write a program to find and display the duplicate characters in the string.
import java.util.Scanner;



public class DuplicateChars
{
	void duplicate(String str)
	{
		int count;    
        //Converts given string into character array    
        char string[] = str.toCharArray();    
            
        System.out.println("Duplicate characters in a given string: ");    
        //Counts each character present in the string    
        for(int i = 0; i <string.length; i++) 
        {    
            count = 1;    
            for(int j = i+1; j <string.length; j++) 
            {    
                if(string[i] == string[j] && string[i] != ' ') 
                {    
                    count++;    
                    // string[j]=0 for avoid scan character    
                    string[j] = '0';    
                }    
            }    
            // if count is greater than 1    i.e duplicate character
            if(count > 1 && string[i] != '0')    
                System.out.println(string[i]);    
        }    
	}
	
	
	
	//Main Method
	public static void main(String[] args) 
	  {
		DuplicateChars db=new DuplicateChars();
		//Input string from user
    	 Scanner sc=new Scanner(System.in);
 		System.out.println("Enter the String :");
 		String str=sc.nextLine();
 		db.duplicate(str);
        
       
	  }

}
	
