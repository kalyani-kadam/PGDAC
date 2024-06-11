package storestudents;

import static java.lang.Thread.currentThread;
import static tester.IOUtils.writeDetails;

import java.util.Comparator;
import java.util.Map;
import java.util.Random;
import java.util.stream.Stream;

import com.app.core.Student;

public class StudentbyName implements Runnable {

	private Random random;
	private String filename;
	private Map<String, Student> studMap;
//	private double gpa;
	
	public StudentbyName(Map<String, Student> studMap,String filename) {
		this.studMap = studMap;
		this.filename = filename;
		random = new Random(); //if u dont pass this reference then it will throw nullPointerException
//		this.gpa = gpa;
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" - started");
		try {
//			while(true) {
	//			Comparator<Student> studcomp = (s1,s2) -> ((Double)s1.getGpa().compareTo(s2.getGpa()));
				Comparator<Student> studcomp = (s1,s2) -> s1.getName().compareTo(s2.getName());
				
				Stream<Student> sortedStream = studMap.values() //Collection<Student>
						.stream()    //Stream<Student>
	//					.filter(s->s.getSubject() == subject)
						.sorted(studcomp); //intermediate operation
				
	//			studMap.values().stream()
	//			.sorted(studcomp)
	//			.forEach(studMap);
				
				writeDetails(sortedStream,filename);
				System.out.println("Data stored by name!!!!!!!!!!!!!");
				
				Thread.sleep(random.nextInt(101) + 100);// 100-200
//			}
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(currentThread().getName() + " got exc " + e);
		}
		System.out.println(currentThread().getName()+ " over");
	}
}
