package tester;

import static utils.IOUtils.readDetails;

import java.util.Scanner;

public class ReStoreStudentDetails {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter file name , to restore student details");
			// invoke IOUtils method to write the details in a text file.
			Object o= readDetails(sc.nextLine());
			System.out.println("Student details -");
			System.out.println(o);
		} // sc.close()
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over...");

	}

}
