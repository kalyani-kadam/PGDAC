package com.app.tester;
import java.sql.*;
import static com.app.utils.DBUtils.openConnection;

public class TestStatement {

	public static void main(String[] args) {
		try(//get database statement
				Connection cn=openConnection();
//			System.out.println("connected to DB "+cn);//implementation class details
			//create empty statement,to hold SQL
			Statement st = cn.createStatement();
//			execute select query & get Resultset
//			ResultSet rst = st.executeQuery("select * from users");
			ResultSet rst = st.executeQuery("select * from users order by email");
		){
//			System.out.println("connected to DB "+cn);
//			ResultSet processing
//			cursor is currently before first row 
//			Ist it will on first row itself not in b/w records like iterator hasnext() & next() 
			
			while(rst.next()) {
//				id | first_name | last_name | email | password | dob | status | role
//				rst.getInt(1);
				System.out.printf("Id: %d Name: %s %s Email: %s "
								+"pwd: %s Dob: %s Status: %b Role: %s %n",
								rst.getInt(1),rst.getString(2),rst.getString(3),
								rst.getString(4),rst.getString(5),rst.getDate(6),
								rst.getBoolean(7),rst.getString(8));
				
			}//if you get dataConversion exceptioin then check column order and datatype
		}//JVM : rst.clese(),st.close(),cn.close() ==>clearing up of DB resources
		catch (Exception e) {
			e.printStackTrace();
		}

	}
}
