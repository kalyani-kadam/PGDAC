package tester;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.stream.Stream;

import com.app.core.Student;

import custom_exception.StudentHandlingException;

public interface IOUtils {
	//
	/*
	 * static void writeDetails(Stream<Student> strm,String fileName) throws
	 * StudentHandlingException, IOException{
	 * 
	 * //create chain of i/o strms: PW--FW--textFile
	 * 
	 * PrintWriter pw = ( new PrintWriter(new FileWriter (fileName)));
	 * strm.forEach(i->pw.println(i)); //strm.forEach(i ->System.out.println(i));
	 * //this will write data on console pw.close(); //if you not closed file then
	 * empty file will be created // FileWriter fw = new FileWrite() }
	 */
	
	
//	autocloseable --> try with resources
	static void writeDetails(Stream<Student> students,String filename)throws StudentHandlingException,IOException{
		try(PrintWriter pw = ( new PrintWriter(new FileWriter (filename)))){
			students.forEach(s->pw.println(s));
		}//JVM: pw.close() --pw.flush(Data will sent to FW) --fw.clse
	}
}
