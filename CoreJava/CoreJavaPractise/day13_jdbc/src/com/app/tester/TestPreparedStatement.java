package com.app.tester;
import static com.app.utils.DBUtils.openConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class TestPreparedStatement {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in);
				
			//get database statement
			Connection cn=openConnection(); //DriverManager --get db connection
				
			//create precompiled stmt, to hold SQL
			//used preparedstmt bcoz here in parameters ARE required
			PreparedStatement pst = 
					cn.prepareStatement("select * from users where email=? and password=?")){
			
				System.out.println("enter email and password");
//				set in parameters : public void setType(int parameterIndex,Type value)throw SQLException
				pst.setString(1, sc.next()); //email  //1 - ? parameter position counted from left to right started from 1 only
				pst.setString(2, sc.next()); //password
//				pst.setDate(2,);
				
//				exec query
				//ResultSet read only
				try(ResultSet rst = pst.executeQuery()){
					if(rst.next())
						System.out.println("Login successful!! Hello, "
					+rst.getString(2)+" "+rst.getString(3)); //2 & 3 are column position in resultSet & it is same table in database bcoz we do select * so appear as  it is resultset  
					else
						System.out.println("Invalid login, email or password is invalid! Login failed!!");
				}//rst.close
			}//JvM :pst.close cn.close() == cleaning up of Db resources
			catch (Exception e) {
				e.printStackTrace();
		}
	}
}
