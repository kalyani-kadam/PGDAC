package char_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class BufferedFileCopy {

	public static void main(String[] args) {
		System.out.println("Enter src file name n dest file name");
		try (// sc
				Scanner sc = new Scanner(System.in);
				// Java App <--- BR <-----FR <---src text file
				BufferedReader br = new BufferedReader
						(new FileReader(sc.nextLine()));
				//Java App --> PW --> FW --> dest text file
				PrintWriter pw=new PrintWriter
						(new FileWriter(sc.nextLine()))
				) {
			
			// chaining of i/s strms : succeesful!

			br.lines() //Stream<String> : lines from buffer of BR
			.forEach(line -> pw.println(line));
			System.out.println("end of try : file copy over....");

		} // JVM :pw.close(pw.flush--> fw.close),  br.close(), sc.close()
		catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("main over....");

	}

}
