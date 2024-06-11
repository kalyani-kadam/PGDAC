package tester;

import static utils.StudentCollectionUtils.populateList;

import static utils.StudentCollectionUtils.populateMap;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.app.core.Student;
import com.app.core.Subject;

import storestudents.StudentbyDob;
import storestudents.StudentbySubject;
import storestudents.StudentbyName;

/* Write a multi thread application for the following
Sort student details as per the DoB n save the details in one file
Save student details of the specified subject sorted as per GPA in another file*/

public class TestStudentThread {

	public static void main(String[] args) throws InterruptedException {
		
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter file name for storing as per dob: ");
			String filename = sc.next();
			System.out.println("Enter subject name: ");
			String subject = sc.next();
			System.out.println("Enter file name for storing as per subject: ");
			String fileName = sc.next();
			System.out.println("Enter file name for storing as per name: ");
			String fname = sc.next();
			
			List<Student> list = populateList();
			Map<String,Student> studMap = populateMap(list);
			
			Thread t1 = new Thread(new StudentbyDob(studMap,filename) ,"t1");
			Thread t2 = new Thread(new StudentbySubject(studMap,fileName,Subject.valueOf(subject.toUpperCase())) ,"t2");
			Thread t3 = new Thread(new StudentbyName(studMap,fname),"t3");
			// start
			t1.start();
			t2.start();
			t3.start();
			
//			t2.start();
			
			//here 
//			t1.run();
//			t2.run();
//			t3.run();
			System.out.println("Main waiting for child thrds to complete exec");
			t1.join();
			t2.join();
			t3.join();
			System.out.println("main over....");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
