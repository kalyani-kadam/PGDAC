package storestudents;

import static java.lang.Thread.currentThread;
import static tester.IOUtils.writeDetails;

import java.util.Comparator;
import java.util.Map;
import java.util.Random;
import java.util.stream.Stream;

import com.app.core.Student;

public class StudentbyDob implements Runnable{
//	private Student stud;
	private Random random;
	private String filename;
	private Map<String, Student> studMap;

	public StudentbyDob(Map<String, Student> studMap, String filename) {
		this.filename = filename;
		this.studMap = studMap;
		random = new Random();
	}
		
	public void run() {
		System.out.println(currentThread().getName() + " - started ");
		try {
//			while(true) {
				Comparator<Student> stud = (s1,s2) -> s1.getDob().compareTo(s2.getDob());
				
				Stream<Student> sortedStream = studMap.values() //Collection<Student>
						.stream()    //Stream<Student>
						.sorted(stud); //intermediate operation
				
				writeDetails(sortedStream,filename);
				System.out.println("Data stored by dob!!!!!!!!!!!!1");
				Thread.sleep(random.nextInt(101) + 100);// 100-200
//			}
//			studMap.values().stream()
//			.sorted(stud)
//			.forEach(s-> System.out.println(s));
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(currentThread().getName() + " got exc " + e);
		}
		System.out.println(currentThread().getName()+ " over");
	}
	
	
}
