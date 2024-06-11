package lists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class IntegerList {

	public static void main(String[] args) {
		// create empty ArrayList of Integer
		ArrayList<Integer> intList=new ArrayList<>();//size 0 , init capa 10
		System.out.println("AL contents");
		for(int i : intList)
			System.out.println(i);//Iterator iterates over : size
		//populate it with some data from the array
		int[] data= {10,2,3,45,12,10,3,4,-80,10,12,34,56,7,8,9,10};
		for(int i : data) //i=data[0], i=data[1]....i=data[data.length-1]
			intList.add(i); //auto boxing
		//display AL : toString / for-each / Iterator /for loop
		System.out.println("AL via toString "+intList);
		System.out.println("AL contents via for-each");
		for(int i : intList)
			System.out.print(i+" ");
		System.out.println();
		System.out.println("AL contents via Iterator ");
		//1. attach Iterator to the list , it's placed before the 1st element.
		Iterator<Integer> itr=intList.iterator();		
		//2 . hasNext , next
		while(itr.hasNext())
			System.out.print(itr.next()+" ");
		//System.out.println(itr.next()); throws : NoSuchElemExc
		System.out.println();
		System.out.println("AL via for loop");
		for(int i=0;i<intList.size();i++)
			System.out.print(intList.get(i)+" ");
		//System.out.println(intList.get(intList.size())); //IndexOfBoundsExc
		//search for the elem : 10
		System.out.println();
		System.out.println(intList.contains(10)?"Present":"Absent");
		//replace 3rd elem by it's double value
		System.out.println("Replaced "+intList.set(3,intList.get(3)*2));
		System.out.println(intList);
		//print index of 1st occurrence of 10 n last occurrence
		System.out.println(intList.indexOf(10)+"  "+intList.lastIndexOf(10));
		//remove last elem
		System.out.println("Removed "+intList.remove(intList.size()-1));
		System.out.println(intList);
		//sorted list
		Collections.sort(intList);
		System.out.println("sorted list");
		System.out.println(intList);
	}

}
