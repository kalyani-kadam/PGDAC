package com.app.dao;

import java.time.LocalDate;
import java.util.List;

import com.app.entities.Role;
import com.app.entities.User;

public interface UserDao {
//add a method for user sign up
	String registerUser(User user);
	
	//add a method to get user details by it's id
	User getUserDetails(Long userId);
	
	//add a method to return list of all users
	List<User> getAllUsers();
	
	List<User> getAllUsersByDobAndRole(LocalDate start,LocalDate end,Role role1);
	
	List<User> getAllUsersNamesByDobAndRole(LocalDate start, LocalDate end, Role role1);
	
	User getSingleUser(String email,String password);
	
	//add a method for users change password
	String getChangePassword(String email,String oldpwd,String newpwd);
}
