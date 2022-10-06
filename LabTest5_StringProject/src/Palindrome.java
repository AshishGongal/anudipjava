//Write a program to check whether a given string is palindrome or not.


import java.util.Scanner;

public class Palindrome 
{

	 public static boolean Palindrome(String str)
	 {
		 //Initializing two indexes, left and right
	        int left = 0, right = str.length() - 1;
	        
	        while(left < right)
	        {  
	        //compare the character at the left index and the character at the right.
	            if(str.charAt(left) != str.charAt(right))
	            {
	                return false; //If the characters are not equal at any point
	            }                  //return false
	            left++;
	            right--;
	        }
	        return true;     //if characters same i.e String is Palindrome
	 }                       //return true
	
	
	
	 
	 //Main Method
	 
	public static void main(String[] args) 
	 {
		//Take the input string from the user
		 Scanner scanner=new Scanner(System.in);
	        System.out.println("Enter a string  to check whether it is palindrome or not");
	        String input= scanner.nextLine();
	        
	        //checking whether palindrome or not
	        if(Palindrome(input))
	        {
	            System.out.println(input+" : is a palindrome string");
	        }
	        else
	        {
	            System.out.println(input+" : is not a palindrome string");
	        }
	 }

}
