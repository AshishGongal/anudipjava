package problem_Second;

public class Palindrome 
{
	//method to check given string is palindrome or not
	public boolean isPalindrome(String value) 
	{
		//value:given string
	    int length = value.length();
	    
	    //check half of string is same as from last index
	    for (int i = 0; i < length / 2; i++) 
	    {
	        if (value.charAt(i) != value.charAt(length-i-1)) 
	        {
	            return false;
	        }
	    }
	    return true;
	}
}
