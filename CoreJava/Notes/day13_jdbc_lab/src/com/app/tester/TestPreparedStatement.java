package com.app.tester;

import java.sql.*;
import java.util.Scanner;

import static com.app.utils.DBUtils.openConnection;

//user login
public class TestPreparedStatement {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);
				// get db cn
				Connection cn = openConnection();
				// create pre-compiled stmt , to hold SQL
				PreparedStatement pst = 
						cn.prepareStatement("select * from users where email=? and password=?")) {
			System.out.println("Enter email n password");
			// set IN params : public void setType(int paramIndex,Type value) throws
			// SQLException
			pst.setString(1, sc.next());// email
			pst.setString(2, sc.next());// pwd
			// exec query
			try (ResultSet rst = pst.executeQuery()) {
				if (rst.next())
					//ResultSet method : Type getType(int colPos/String colName) throws SQLException
					System.out.println("Login successful !  Hello , " 
				+ rst.getString("first_name") + " " + rst.getString(3));
				else
					System.out.println("Invalid Login , email or password invalid !!!!!");
			}//rst.close

		} // JVM : pst.close cn.close() => cleaning up of DB resources , sc.close
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over...");

	}

}
