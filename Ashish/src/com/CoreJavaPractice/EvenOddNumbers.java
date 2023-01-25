package com.CoreJavaPractice;

import java.util.Scanner;

public class EvenOddNumbers
{

	//method for checking given number is even or odd
	public static  void checkNumbers()
	{
		System.out.println("Enter the Number : ");
		Scanner sc=new Scanner(System.in);
		  int num = sc.nextInt();
		 
		  
		// If number is divisible by 2 then it's an even number
		   //else it is an odd number
		if(num %2==0)
		{
			System.out.println("Given Number is Even");
		}
		else
		{
			System.out.println("Given Number is Odd");
		}
		
		sc.close();
	}
	
	//main method
	public static void main(String[] args)
	{
		checkNumbers();
	}

}
