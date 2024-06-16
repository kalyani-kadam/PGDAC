package com.app.dao;

import com.app.entities.User;

public interface UserDao {
//add a method for user sign up
	String registerUser(User user);
	//add a method to get user details by it's id
	User getUserDetails(Long userId);
}
