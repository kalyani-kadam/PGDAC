package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public interface IOUtils {


	// add a static method for restoring student details , from a bin file using
	// de-ser.
	
	static Object readDetails(String fileName) throws IOException, ClassNotFoundException {
		// Java App <--- OIS <--- FIS (bin file)
		try (ObjectInputStream in = 
				new ObjectInputStream(
						new FileInputStream(fileName))) {
			return in.readObject();
		}
	}

}
