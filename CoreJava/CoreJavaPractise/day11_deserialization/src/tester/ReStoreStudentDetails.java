package tester;

import static utils.IOUtils.readDetails;

import java.util.Scanner;


//first copy .ser file from serialization package

//deserialization requires .class file of UDT

public class ReStoreStudentDetails {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter file name , to restore student details");
			// invoke IOUtils method to write the details in a text file.
			Object o = readDetails(sc.nextLine());
			System.out.println("Student details -");
//			map.forEach((k,v)-> System.out.println(v));
			System.out.println(o); //it will call to String
		} // sc.close()
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over...");

	}

}
