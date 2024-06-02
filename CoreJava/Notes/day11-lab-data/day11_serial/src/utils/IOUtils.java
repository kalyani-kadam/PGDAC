package utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;

import com.app.core.Student;

public interface IOUtils {
//add a static method for storing student details , in a bin file using ser.
	static void writeDetails(Map<String, Student> students, String fileName) throws IOException {
		// Java App --> OOS --> FOS (bin file)
		try (ObjectOutputStream out = 
				new ObjectOutputStream(new FileOutputStream
						(fileName))) {
			out.writeObject(students);// serialization
		} // JVM : out.close --fos.close --close the file handle
	}

}
