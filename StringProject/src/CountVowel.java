 
/*count the numbers of vowels in a string given 
  * by user using charAt() print the count*/
  

import java.util.Scanner;

public class CountVowel 
{
  public static void main(String[] args)
    {
	  //s1=entered string  
	  //vowels =aeiouAEIOU
	  
	  String s1,vowels; 
	  
	  char ch; //ch=s1.charAt(i);
	 
	  
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String: ");
        s1 = scan.nextLine();

    
        int count = 0;
        vowels = "aeiouAEIOU";

        for (int i = 0; i < s1.length(); i++)
        {
            ch = s1.charAt(i);  //Using String charAt()

            if(ch==vowels.charAt(i))
            {
                count++;
            }
        }
        System.out.print("\nNumber of Vowels in the string is: " + count);
    }
}
