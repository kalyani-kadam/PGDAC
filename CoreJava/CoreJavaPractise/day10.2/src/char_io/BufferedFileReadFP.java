package char_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class BufferedFileReadFP {

	public static void main(String[] args) {
		System.out.println("Enter src file name");
		try (// sc
				Scanner sc = new Scanner(System.in);
				// Java App <--- BR <-----FR <---src text file
				BufferedReader br = new BufferedReader
						(new FileReader(sc.nextLine()))) {
			// chaining of i/s strms : succeesful!
//			String line = null;
//			System.out.println("File contents ------------");
//			while ((line = br.readLine()) != null)
//				System.out.println(line);
			br.lines() //Stream<String> : lines from buffer of BR
			.forEach(line -> System.out.println(line));
			System.out.println("end of try : file read over....");

		} // JVM : br.close(), sc.close()
		catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("main over....");

	}

}
