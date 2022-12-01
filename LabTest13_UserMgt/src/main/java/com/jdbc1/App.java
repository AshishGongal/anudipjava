package com.jdbc1;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Scanner;

import com.jdbc1.dao.UserDao;
import com.jdbc1.daoimpl.UserDaoImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        
        UserDao udao = new UserDaoImpl();
        
        //below are choices to user to execute the queries
        System.out.println("1. To Create an User:");
		System.out.println("2. To Update User Data:");
		System.out.println("3. To Delete User:");
		System.out.println("4. To View User Data:");
		System.out.println("5. To View all Users Data:");
		System.out.println("6. To Exit:");
		
		try {
			//taking input from user throw scanner class
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter Choice :");

			int ch = scan.nextInt();
			int i = 0;
			
			//switch case
			switch (ch) {
			
			
			
			//case 1 for creating a user
			case 1: {
				scan.nextLine();
				System.out.println("Enter the User Name");
				String username=scan.nextLine();
				System.out.println("Enter the password ");
				String password=scan.next();

				//checking that the password is not less than 6 characters &
				//not containing the space
				
				 if(password.length()>6 && !password.contains(" "))
				{
					 //try-catch block to handle exception if user enter unique username 
					try {
						
					i = udao.insertUserDetails(username,password);
					
					}catch(SQLIntegrityConstraintViolationException sqlice) 
					{
						System.out.println("User alreday exist.Create a unique user name");
					}
				if(i>0)
					System.out.println("successfully user created !");
				
				}
				else
				{
					System.out.println("please enter a valid password");
				}
				
				break;
			}
            
		//case 2 for  updating the new password
			case 2:{
							System.out.println("Enter that name by whose reference the password is updated:");
							String uname=scan.next();
							System.out.println("Enter new password to update: ");
							String password=scan.next();
							i=udao.updateUserDetails(uname,password);
							if(i>0)
								System.out.println("Successfully password is updated");
							else
								System.out.println("Enter valid username to update password");
							
							break;
							} 
						
			//case 3 for deleting the user 
			case 3:{
							System.out.println("Enter user name to delete the user");
							String uname=scan.next();
							i=udao.deleteUserDetails(uname);
							if(i>0)
							System.out.println("User deleted successfully");
							break;
			            }
			//case 4 for display particular user details
			case 4:{
							System.out.println("Enter name to Retrive a user");
							String uname=scan.next();
							udao.displayParticularUser(uname);
						    System.out.println("User details displayed successfully");
							break;
			           }
			//case 5 for displaying all users details
			case 5:{
							System.out.println("displaying the list of all the users");
							udao.displayAllUser();
							System.out.println("displaying all users details successfully");
							break;
			            }
			//case 6 for exits from query
			case 6:{
							System.exit(0);
			            }
			default:
				System.out.println("Enter valid choice...");

			}
			//close scanner
			scan.close();
		} catch (SQLException se) {
			se.printStackTrace();
		}
		
	
    }
		
}


