package tester;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * accept dob of the bank customer n display it,legacy API
 */

public class Test1 {
	private static SimpleDateFormat sdf; //require only one converter for all objects and main method is static for this purpose this method is static
	static {
		System.out.println("in static block");
		sdf=new SimpleDateFormat("yyyy-MM-dd");
	}

	public static void main(String[] args) /* throws ParseException */{
		try(Scanner sc=new Scanner(System.in))
		{
			System.out.println("Enter DoB - yyyy-MM-dd");
			//user : string(sc.next() --> Date 
			//need to use parsing API of SimpleDateFormat class
			//parseException is checked exception
			Date dob=sdf.parse(sc.next());
			System.out.println("Formatted Dob "+sdf.format(dob));
			System.out.println("end of try...");
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("main continues...");
	}

}
