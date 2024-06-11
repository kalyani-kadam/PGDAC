package tester;

import java.time.LocalDate;
import java.util.Scanner;

/*
 * accept dob of the bank customer n display it,using modern API
 */

public class Test2 {

//	public static void main(String[] args) {
//		try (Scanner sc = new Scanner(System.in)) {
//			System.out.println("Enter DoB - yyyy-MM-dd");
//			// user : string(sc.next() --> LocalDate
////			LocalDate has overide parse method 
//			LocalDate dob = LocalDate.parse(sc.next());
//			System.out.println(dob);
//			System.out.println("end of try...");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println("main continues...");
//	}
	
	public static void main(String[] agrs) {
		try (Scanner sc = new Scanner(System.in)){
			System.out.println("enter dob");
			LocalDate d = LocalDate.parse(sc.next());
			System.out.println(d);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
