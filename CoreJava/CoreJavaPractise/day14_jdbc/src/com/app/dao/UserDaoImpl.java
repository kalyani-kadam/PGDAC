package com.app.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static com.app.utils.DBUtils.*;

import com.app.entities.User;

public class UserDaoImpl implements UserDao {
	// state
	private Connection cn;
	private PreparedStatement pst1, pst2, pst3,pst4,pst5,pst6,pst7,pst8;
//	private ResultSet rst;
//	private Statement pst8;
	// def ctor of the DAO layer
	public UserDaoImpl() throws SQLException {
		// get cn from db utils
		cn = openConnection();
		// pst1 : sign in
		pst1 = cn.prepareStatement("select * from users where email=? and password=?");
		// pst2 : get user details
		pst2 = cn.prepareStatement("select * from users where role='voter' and dob between ? and ?");
		// pst3 : voter reg
		/*
		 * id | first_name | last_name | email | password | 
		 * dob | status | role
		 */
		
		pst3 = cn.prepareStatement("insert into users values(default,?,?,?,?,?,?,?)");
		//update password of user 
		pst4 = cn.prepareStatement("update users set password=? where role = 'voter' and email=? and password=?");
		//delete userfrom database
		pst5 = cn.prepareStatement("delete from users where id =? and role='voter'");
		pst6 = cn.prepareStatement("update users set status = true where id =?");
		pst7 = cn.prepareStatement("update candidates set votes = votes+1 where name=?");
		pst8 = cn.prepareStatement("select * from users where id=? and status=true");
		
		System.out.println("user dao created...");
	}

	@Override
	public User signIn(String email, String password) throws SQLException {
		// 1. set IN params
		pst1.setString(1, email);
		pst1.setString(2, password);
		// 2. exec query
		try (ResultSet rst = pst1.executeQuery()) {
			// rst cursor : before the 1st row
			
			if (rst.next()) // => successful login
				return new User(rst.getInt(1), rst.getString(2), rst.getString(3), email, password, rst.getDate(6),
						rst.getBoolean(7), rst.getString(8));
		}
		return null;
	}

	@Override
	public List<User> getUserDetails(Date begin, Date end) throws SQLException {
		// 0. create empty list
		List<User> users = new ArrayList<>();
		// 1. set IN params
		pst2.setDate(1, begin);
		pst2.setDate(2, end);
		// 2 . exec -- exec query
		try (ResultSet rst = pst2.executeQuery()) {
			while (rst.next())
				users.add(new User(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4),
						rst.getString(5), rst.getDate(6), rst.getBoolean(7), rst.getString(8)));
		}
		return users;// dao rets populated list of users to the caller
	}

	@Override
	public String voterRegistration(User newVoter) throws SQLException {
		// 1. set IN params
		/*
		 * int userId, String firstName, String lastName, 
		 * String email, String password,
		 * Date dob, boolean status, String role
		 */
		pst3.setString(1, newVoter.getFirstName());
		pst3.setString(2, newVoter.getLastName());
		pst3.setString(3, newVoter.getEmail());
		pst3.setString(4, newVoter.getPassword());
		pst3.setDate(5, newVoter.getDob());
		pst3.setBoolean(6, newVoter.isStatus());
		pst3.setString(7, newVoter.getRole());
		//exec : executeUpdate
		int rows=pst3.executeUpdate();
		if(rows == 1)
			return "Voter registered....";
		return "Voter registration failed !";
	}

	// add clean up method to close DB resources
	public void cleanUp() throws SQLException {
		System.out.println("User dao cleaned up");
		if (pst1 != null)
			pst1.close();
		if (pst2 != null)
			pst2.close();
		if (pst3 != null)
			pst3.close();
		closeConnection();
	}

	@Override
	public String UpdatePassword(String email, String oldPwd, String newPwd) throws SQLException {
		
		pst4.setString(1, newPwd);
		pst4.setString(2, email);
		pst4.setString(3, oldPwd);
		
		if(pst4.executeUpdate() == 1)
			return "Password updated successfully!";
		return "Invalid email or password! or may be admin user try to change pasword";
	}

	@Override
	public String deleteUser(int id) throws SQLException{
		pst5.setInt(1, id);
		if(pst5.executeUpdate() == 1)
			return "User deleted successfully!!";
		return "Invalid id or may be you are deleting admin user!!";
	}
	
	@Override
	public String updateUserCanditates(int id,String name)throws SQLException{
		pst6.setInt(1, id);
		pst7.setString(1, name);
		
//		System.out.println(pst6.executeUpdate());
//		System.out.println(pst7.executeUpdate());
		if(pst6.executeUpdate() == 1)
			if(pst7.executeUpdate() == 1)
				return "Votes and status updated successfully";
		return "Invalid id or name!!";
	}
	
	
//	  public boolean hasVoted(int id)throws SQLException{ 
//		  ResultSet st = cn.createStatement();
//	  
//	  st=pst8.executeQuery(); 
//	  // System.out.println("in hasvoted"); 
//	  if(rst.next())
//	  { 
//		  return true; 
////	  		System.out.println("Voted successfully"); 
//	  } 
//	   return false; 
////			   System.out.println("not Voted successfully"); }
//	  }
}
