package com.jdbc1.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jdbc1.connection.ConnectionProvider;
import com.jdbc1.dao.UserDao;


       //implementing the interface UserDao
public class UserDaoImpl implements UserDao {
	
	Connection con=ConnectionProvider.getConnection();

	
		//Method for inserting the User details
	public int insertUserDetails(String user, String password) throws SQLException {
		String query="insert into users(uname,password) values(?,?)";
		PreparedStatement ps=con.prepareStatement(query);
		ps.setString(1,user);
		ps.setString(2,password);
		int i=ps.executeUpdate();
		return i;
		
	}
	
	//method for updating user details
	public int updateUserDetails(String user, String password) throws SQLException {
		String query="update users set password= ? where uname= ?";
		PreparedStatement ps=con.prepareStatement(query);
		ps.setString(1,password);
		ps.setString(2,user);
		int i=ps.executeUpdate();
		return i;
	}
	
	//method for deleting user details
	public int deleteUserDetails(String user) throws SQLException {
		String query="delete from users where uname=?";
		PreparedStatement ps=con.prepareStatement(query);
		ps.setString(1,user);
		int i=ps.executeUpdate();
		return i;
		
	}

	//method for displaying particular user details
	public void displayParticularUser(String user) throws SQLException {
		String query="Select * from users where uname=?";
		PreparedStatement ps=con.prepareStatement(query);
		ps.setString(1,user);
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		 {
			System.out.println("User Name :"+rs.getString(1));
			System.out.println("Password:"+rs.getString(2));
			System.out.println("------------------------------");
		 }
		
	}
	//method for displaying all users details
	public void displayAllUser() throws SQLException {
		String query="Select * from users";
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery(query);
		while(rs.next())
		 {
			System.out.println("User Name :"+rs.getString(1));
			System.out.println("Password:"+rs.getString(2));
			System.out.println("-------------------------------");
		 }
		
	}
	
}
