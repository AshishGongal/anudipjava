
public class PaliNum 
{
	public static  void ispalindrome(int number) 
	{
		int Temp, Reminder, Reverse = 0;
		Temp = number;
		while(Temp > 0) 
		 {
			Reminder = Temp %10;
			Reverse = Reverse * 10 + Reminder;
			Temp = Temp /10;
		 }
		if(number == Reverse) 
		 {
			System.out.println(+number+" :is a palindrome");
		 }

		else
		 {
			System.out.println(+number+" :is not a palindrome");
		 }
	}
	

	public static void main(String[] args) 
	{
		ispalindrome(137);
	}

}
