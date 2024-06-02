package tester;

import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

import com.app.core.Student;

import static utils.StudentCollectionUtils.*;
import static utils.IOUtils.writeDetails;

public class StoreStudentDetails {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// get the populated map from coll utils
			Map<String, Student> map = populateMap(populateList());
			System.out.println("Enter file name , to store student details");
			// invoke IOUtils method to write the details in a text file.
			writeDetails(map, sc.nextLine());
			System.out.println("data stored ....");
		} // sc.close()
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over...");

	}

}
