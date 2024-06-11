package sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestHashSet {

	public static void main(String[] args) {
		String[] strings= {"one","two","three","four","five","six","one","five"};
		//Create empty HashSet to store the strings n populate it from array
		Set<String> stringSet=new HashSet<>();
		for(String s : strings)
			System.out.println("Added "+stringSet.add(s));
		System.out.println("size "+stringSet.size());
		System.out.println("Set : "+stringSet);
		//can u attach for-each / Iterator for traversing the set ? YES
		System.out.println("Set via for-each");
		for(String s : stringSet)
			System.out.println(s);
		//remove the strings : starting with char f
		Iterator<String> stringItr=stringSet.iterator();
		while(stringItr.hasNext())
		{
			String s=stringItr.next();
			if(s.startsWith("f"))
				stringItr.remove();
		}
		
		System.out.println("Set after remove "+stringSet);
		

	}

}
