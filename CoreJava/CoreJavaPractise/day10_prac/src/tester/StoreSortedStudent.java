package tester;

import java.io.IOException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;
//import tester.IOUtils.*;
import static tester.IOUtils.*;
import static utils.StudentCollectionUtils.*;
import com.app.core.Student;
import custom_exception.StudentHandlingException;

public class StoreSortedStudent {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
//			1 Solve 
//			Suppose you have student details in a map. Can you store these details sorted as per name in a text file , in a buffered manner ?

				Map<String,Student> stud = populateMap(populateList());
				
				Comparator<Student> comp = (s1,s2) ->
				s1.getName().compareTo(s2.getName());
				
				Stream<Student> sortedStream = stud.values() //Collection<Student>
				.stream()    //Stream<Student>
				.sorted(comp); //intermediate operation
				
				System.out.println("Enter file name to store details: ");
				//invoke IOUtils method to write the details in a text file
				writeDetails(sortedStream,sc.nextLine());
				System.out.println("data stored");
//				readDetails()
				
		}//sc.close()
		catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("main over...");
	}

}