package iterators;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class Test4 {

	public static void main(String[] args) {
		// create empty ArrayList of Integer
		ArrayList<Integer> intList=new ArrayList<>();//size 0 , init capa 10
			//populate it with some data from the array
		int[] data= {10,2,3,45,12,10,3,4,-80,10,12,34,56,7,8,9,10};
		for(int i : data) //i=data[0], i=data[1]....i=data[data.length-1]
			intList.add(i); //auto boxing
		//display AL :  Iterator 
		Iterator<Integer> itr=intList.iterator();//itr --> before the 1st elem
		System.out.println("AL via Iterator ");
		while(itr.hasNext()) {
		//	itr.remove();//IllegalStateExc
			System.out.print(itr.next()+" ");
			itr.remove();
		}
		System.out.println("list after remove "+intList);
		
		System.out.println("main over....");
		
		
	}

}
