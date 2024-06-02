package com.app.tester;

import java.sql.*;
import static com.app.utils.DBUtils.openConnection;

public class TestStatement {

	public static void main(String[] args) {
		try (// get db cn
				Connection cn = openConnection();
				// create empty stmt , to hold SQL
				Statement st = cn.createStatement();
				// exec select query n get ResultSet
				ResultSet rst = st.executeQuery("select * from users order by email");) {
			// ResultSet processing
			// cursor --> before the 1st row
			while (rst.next()) {
				/*
				 * id | first_name | last_name | email | password 
				 * | dob | status | role
				 */
				System.out.printf("Id %d Name %s %s Email %s" 
				 + "pwd %s DoB %s Status %b Role %s %n", rst.getInt(1),
						rst.getString(2), rst.getString(3), 
						rst.getString(4), rst.getString(5), rst.getDate(6),
						rst.getBoolean(7), rst.getString(8));
			}
		} // JVM : rst.close , st.close cn.close() => cleaning up of DB resources
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
