package sets;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet2 {

	public static void main(String[] args) {
		String[] strings= {"one","two","three","four","five","six","one","five"};
		//Create a TreeSet --to store above strings in desc manner.
		
		//TreeSet(Comparator<T> comp)
		Set<String> stringSet=new TreeSet<>(new Comparator<String>() 
		{ //ano inner cls begin
			@Override
			public int compare(String s1,String s2)
			{
				System.out.println("in compare -ano inner");
				return s2.compareTo(s1);
			}
		}//ano innner cls end
		);
		
		for(String s : strings)
			System.out.println("Added "+stringSet.add(s));

		System.out.println("Set via for-each");
		for(String s : stringSet)
			System.out.println(s);
		
		

	}

}
