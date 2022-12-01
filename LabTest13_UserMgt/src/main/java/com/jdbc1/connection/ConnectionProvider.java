package com.jdbc1.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
	public static Connection getConnection() 
	{
		
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/labtest_13","root","Hioraj@1965");
			
		} catch (SQLException e) 
		  {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		 }
		
	}
}
