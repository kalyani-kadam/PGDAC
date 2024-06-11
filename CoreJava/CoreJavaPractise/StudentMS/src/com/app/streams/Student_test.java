package com.app.streams;

import static utils.StudentCollectionUtils.*;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.IntStream;

import com.app.core.Student;
import com.app.core.Subject;
public class Student_test {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){
		// get populated map of students,display all
			Map<String,Student> studentmap = populateMap(populateList());
			List<Student> studentlist = populateList();
			
			studentmap.forEach((k,v) -> System.out.println(v));
			
			System.out.println("enter subject");
			Subject sub = Subject.valueOf(sc.next().toUpperCase());
			studentmap.values() //collection of student 
			.stream() //stream<Student>
			.filter(s->s.getSubject()==sub) //filter is method of stream
			.forEach(i -> System.out.println(i));
			
			//display student (gpa>6)
			studentmap.values()
			.stream()
			.filter(s -> s.getSubject() == sub)
			.filter(s-> s.getGpa() > 6)
			.forEach(i -> System.out.println(i));
			
			System.out.println("original data");
			studentmap.values()
			.forEach(i -> System.out.println(i));
			
//			display sum of gpas of all passed students, (map)
			double sum = studentmap.values()
					.stream()  //stream<student>
					.filter(i-> i.getGpa() > 6) //stream<student> : passed
					.mapToDouble(i -> i.getGpa()) //double stream : primitive stream
					.sum();
			System.out.println("Sum of gpas of passed students: "+sum);
			
//			display student details from list of student,sorted as per dob
//			collection.sort return type is void thats why we cant perform chaining on void value
			System.out.println("\nstudent details from list of student,sorted as per dob");
			Comparator<Student> comp = (s1,s2) -> s1.getDob().compareTo(s2.getDob());
			
			studentlist.stream()
//			.sorted((s1,s2) -> s1.getDob().compareTo(s2.getDob()))
			.sorted(comp)
			.forEach(i -> System.out.println(i));
			
//			print name of subject topper
			System.out.println("\nName of subject topper: ");
			Comparator<Student> compgpa = (s1,s2) -> ((Double)s1.getGpa()).compareTo(s2.getGpa());
			Student topper = studentmap.values() //collection<student>
			.stream() //stream<student>
			.filter(i-> i.getSubject() == sub) //
			.max(compgpa)
			.get();
			
			System.out.print(topper);
			
			System.out.println("\nName of subject topper: ");
//			Comparator<Student> compgpa1 = (s1,s2) -> ((Double)s1.getGpa()).compareTo(s2.getGpa());
			Optional<Student> optional = studentmap.values() //collection<student>
			.stream() //stream<student>
			.filter(i-> i.getSubject() == sub) //
			.max((s1,s2) -> ((Double)s1.getGpa()).compareTo(s2.getGpa()));
			if(optional.isPresent())
				System.out.println("Topper details \n"+optional.get());
			else
				System.out.println("Student not prsent!!");
//			.get();
			
//			System.out.print(topper);
		}
	}
}
