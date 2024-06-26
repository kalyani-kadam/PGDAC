package com.app.beans;

import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Period;

import com.app.dao.UserDaoImpl;
import com.app.entities.User;

public class UserBean {
//state -- request params from clnt mapped to Java bean properties
	private String email;
	private String password;
	private String firstName;
	private String lastName;
	private String dob;
	//dependency -- dao layer
	private UserDaoImpl userDao;
	//add a property to store validated user details
	private User userDetails;
	private String message;
	//def ctor 
	public UserBean() throws SQLException{
		// create dao instance
		userDao=new UserDaoImpl();
		System.out.println("user bean created...");
	}
	//getter n setter
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public UserDaoImpl getUserDao() {
		return userDao;
	}
	public void setUserDao(UserDaoImpl userDao) {
		this.userDao = userDao;
	}
	public User getUserDetails() {
		return userDetails;
	}
	public void setUserDetails(User userDetails) {
		this.userDetails = userDetails;
	}
	
	public String getMessage() {
		return message;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	//Add B.L method for user authentication
	public String validateUser() throws SQLException{
		System.out.println("in validate user "+email+" "+password);
		//bean --> invokes dao's method
		userDetails=userDao.signIn(email, password);
		if(userDetails == null) {
			//invalid login
			message="Invalid Email or Password , Please retry!";
			return "login";//Bean rets navigational outcome to JSP(tells JSP, where to take client next)
		}
		//=> valid login --> chk role based authorization
		message="Login Successful!";
		if(userDetails.getRole().equals("admin"))
			return "admin_main";
		//=> voter login
		if(userDetails.isStatus())
			return "logout";
		//not yet voted
		return "candidate_list";
	}
	
	//add a B.L method for validating i/ps n then registration
	public String validateNRegisterUser() throws SQLException{
		//parse and validate parse dob --> LocalDate n validate
		//in case of invalid age -- return error msg
		//o.w. invoke DAO method for registration
		setFirstName(firstName);
		setLastName(lastName);
		setEmail(email);
		setPassword(password);
		setDob(dob);
		LocalDate date = LocalDate.parse(dob);
		Period a = Period.between(date, LocalDate.now());
		int age = a.getYears();
		if(age<21) {
			message = "Invalid age";
			return "registration failed";
		}
		User Voter = new User(firstName,lastName,email,password,Date.valueOf(date));
		return userDao.voterRegistration(Voter);
		
	}
}
