package sets;

import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet1 {

	public static void main(String[] args) {
		String[] strings= {"one","two","three","four","five","six","one","five"};
		//Create empty TreeSet to store the strings n populate it from array
		Set<String> stringSet=new TreeSet<>();
		for(String s : strings)
			System.out.println("Added "+stringSet.add(s));
		System.out.println("size "+stringSet.size());
		System.out.println("Set : "+stringSet);
		//can u attach for-each / Iterator for traversing the set ? YES
		System.out.println("Set via for-each");
		for(String s : stringSet)
			System.out.println(s);
		
		

	}

}
