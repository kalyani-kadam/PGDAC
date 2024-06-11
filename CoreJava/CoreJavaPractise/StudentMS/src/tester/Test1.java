package tester;

import static utils.StudentCollectionUtils.*;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.app.core.Student;
import com.app.core.Subject;

public class Test1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// get populated list from utils
		List<Student> list = populateList();
//		1.1 Display all student details from a student list
		list.forEach(s -> System.out.println(s));
		
//		2  Display all student details from a student map
//		display student id and gpa
		System.out.println("===student id and gpa===");
		Map<String,Student> map = populateMap(list);
		map.forEach((k,v) -> System.out.println("Id: "+k+" GPA: "+v.getGpa()));
//		map.forEach((k,v) ->System.out.println("Roll no : "+v.getRollNo()+" GPA: "+v.getGpa())); //same as above line code
		
//		3 Display all student details(from the list) sorted as per GPA (desc order)
//		Collections.sort(map(s1,s2) -> )
		
//		functional literal
		System.out.println("=====Desc order as per GPA====");
		Comparator<Student> studComp = (s1,s2) ->{
		if(s1.getGpa()<(s2.getGpa())){
			return 1;
		}
		else if(s1.getGpa() == s2.getGpa()) {
			return 0;
		}else {
			return -1;
		}
		};
//		Collections.sort(list, studComp);
//		list.forEach(s->System.out.println(s));
		
//		functional programming
		/*
		 * Collections.sort(list, (s1,s2) -> { System.out.println("in lambda");
		 * if(s1.getGpa()<(s2.getGpa())){ return 1; } else if(s1.getGpa() > s2.getGpa())
		 * { return -1; }else { return 0; } }); System.out.println("sorted list");
		 * list.forEach(s -> System.out.println(s));
		 */
		
//		System.out.println("sorting as per gpa----");
//		Comparator<Student> studentComp = (s1,s2) ->
//		((Double)s1.getGpa()).compareTo(s2.getGpa()); //converting to double
//		Collections.sort(list, studComp);
		
		System.out.println("=========Sorting by dob=========");
		Comparator<Student> stud = (s1,s2) -> s1.getDob().compareTo(s2.getDob());
		map.values().stream()
		.sorted(stud)
		.forEach(s-> System.out.println(s));
		
//		list.forEach(s ->System.out.println(s));
		
		
//		4 Remove all failed students from the map n display the map again
		System.out.println("===All students====");
		map.forEach((k,v) -> System.out.println(v));
		System.out.println("===PASEED students====");
		map.values().removeIf(m -> m.getGpa()< 6);  //collection<Student>
		map.forEach((k,v) -> System.out.println(v));
		
		
		System.out.println("===== Phone no sorting ======");
		Comparator<Student> studPhoneComp = (s1,s2) ->{
			return s1.getAddress().getPhoneNo().compareTo(s2.getAddress().getPhoneNo());
		};
		Collections.sort(list,studPhoneComp );
		list.forEach(s -> System.out.println(s));
		
		System.out.println("===== Sort as per name is asc =====");
		Comparator<Student> sortName = (s1,s2)->{
			return s1.getName().compareTo(s2.getName());
		};
		Collections.sort(list,sortName);
		list.forEach(s-> System.out.println(s));
	
		System.out.println("===== Sort as per name in desc =====");
		Comparator<Student> sortDescName = (s1,s2)->{
			return s2.getName().compareTo(s1.getName());
		};
		Collections.sort(list,sortDescName);
		list.forEach(s-> System.out.println(s));
		
		System.out.println("======== sort as per subject =======");
		
		Comparator<Student> sortSub = (s1,s2) -> {
			return s1.getSubject().compareTo(s2.getSubject());
		};
		Collections.sort(list,sortSub);
		list.forEach(s ->System.out.println(s));
		
		System.out.println("====== Filtered student ======= ");
		System.out.println("Enter subject: ");
		Subject sub = Subject.valueOf(sc.next().toUpperCase());
		list.stream()
		.filter(i ->i.getSubject() == sub)
		.forEach(s -> System.out.println(s));
		
		//if subject is not given then this exception how to handle exception
		//Exception in thread "main" java.lang.IllegalArgumentException: No enum constant com.app.core.Subject.CPP
		
//		System.out.println("=== year : 1999");
//		LocalDate date = LocalDate.parse("1999-12-13");
//		list.stream()
//		.filter(i -> (LocalDate) i.getDob() == date)
//		.forEach(s ->System.out.println(s));
		
		System.out.println("=== year sorting ====");
		Comparator<Student> date=(s1,s2) ->{
			return s1.getDob().compareTo(s2.getDob());
		};
		Collections.sort(list,date);
		list.forEach(s -> System.out.println(s));
	}

}
