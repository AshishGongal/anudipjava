package com.jdbc1.dao;

import java.sql.SQLException;

public interface UserDao {

	//abstract UserDao interface method
	
	//to insert user
	public int insertUserDetails(String user,String password) throws SQLException;
	
	//to update user details i.e password,uname
	public int updateUserDetails(String user,String password) throws SQLException;
	
	//to delete user details i.e password
	public int deleteUserDetails(String user) throws SQLException;
	
	//to view particular users details
	public void displayParticularUser(String user) throws SQLException;
	
	//to view all users details
	public void displayAllUser() throws SQLException;
	
	
}
