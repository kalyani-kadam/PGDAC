package storestudents;

import static java.lang.Thread.currentThread;
import static tester.IOUtils.writeDetails;

import java.util.Comparator;
import java.util.Map;
import java.util.Random;
import java.util.stream.Stream;

import com.app.core.Student;
import com.app.core.Subject;

public class StudentbySubject implements Runnable {


	private Subject subject;
	private Random random;
	private String filename;
	private Map<String, Student> studMap;
	
	public StudentbySubject(Map<String, Student> studMap, String filename, Subject subject) {
		this.studMap = studMap;
		this.filename = filename;
//		this.sub=Subject.valueOf(subject); 
		this.subject = subject;
		random = new Random();
	}
	
	@Override
	public void run() {
		System.out.println(currentThread().getName() + " - started ");
		try {
//			while(true) {
				Comparator<Student> stud = (s1,s2) -> s1.getSubject().compareTo(s2.getSubject());
				
				Stream<Student> sortedStream = studMap.values() //Collection<Student>
						.stream()    //Stream<Student>
						.filter(s->s.getSubject() == subject)
						.sorted(stud); //intermediate operation
				
				writeDetails(sortedStream,filename);
				System.out.println("Data stored by subject!!!!!!!!!!!!1");
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
