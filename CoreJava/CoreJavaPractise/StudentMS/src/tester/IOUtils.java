package tester;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.stream.Stream;

import com.app.core.Student;

import custom_exception.StudentHandlingException;
import storestudents.StudentbySubject;

public interface IOUtils {
	static void writeDetails(Stream<Student> students,String filename)throws StudentHandlingException,IOException{
		try(PrintWriter pw = ( new PrintWriter(new FileWriter (filename)))){
			students.forEach(s->pw.println(s));
		}//JVM: pw.close() --pw.flush(Data will sent to FW) --fw.clse
	}
	
	static void readDetails(Stream<Student> students,String filename)throws StudentHandlingException, FileNotFoundException, IOException{
		try(BufferedReader br = (new BufferedReader(new FileReader (filename)))){
			students.forEach(s -> System.out.println(s));
		}
	}
}
