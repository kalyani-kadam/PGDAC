package strings;

import java.util.Arrays;

public class CompareStrings {

	public static void main(String[] args) {
		String[] names= {"Anish","Rutva","Amiti","Rutuj","Mihir","Amiti"};
		
		System.out.println(names[0].compareTo(names[1]));//  <0
		System.out.println(names[2].compareTo(names[0]));// <0 
		System.out.println(names[1].compareTo(names[3]));// > 0
		System.out.println(names[2].compareTo(names[5])); //0
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		
		
		
		

	}

}
