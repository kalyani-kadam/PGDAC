package utils;

import java.util.Collection;

public class GenericUtils {
//add a static method to print the elems of type T : using type T
	public static <T> void printAllElements(Collection<T> collection)
	{
		for(T o : collection)
			System.out.println(o);//toString
	}
	
	//add a static method to print the elems of ANY type : using ?
		public static void printAllElements2(Collection<?> collection)
		{
			for(Object o : collection)
				System.out.println(o);//toString
		}
}
