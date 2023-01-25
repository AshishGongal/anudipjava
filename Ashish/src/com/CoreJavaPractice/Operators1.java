package com.CoreJavaPractice;

import java.util.Scanner;

public class Operators1 {
	int i=1;
	public static void validUser() 
	{
		String a="ashish";
		String b="root";
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter UsernName :");
		String uid=sc.next();
		System.out.println("Enter PassWord :");
		String upass=sc.next();
		
		if ((uid.equals(a) && upass.equals(b)) || (uid.equals(b) && upass.equals(a)))
		{
			System.out.println("Login Done...!!!");
		}else
		{
			System.out.println("Wrong UserName Or passWord");
		}
		
	}
	
	public static void whileDemo()
	{
		int i=1;
		while(i<=10)
		{
			System.out.println(i*5);
			i++;
		}
		
	}
	
	public static void dowhileDemo()
	{
		int i=20;
		do {
			System.out.println(i);
			i--;
		}while(i>15);
	}
	
	public static void continueDemo() 
	{
		for(int i=1;i<=10;i++) 
		{
			if(i==8)
			{
				continue;
				//break;
			}
			System.out.println(i);
		}
	}
	
	//Main method
	public static void main(String[] args)
	{
		
		//validUser() ;
		//whileDemo();
		//dowhileDemo();
		
		continueDemo();

		
		
	}

}
