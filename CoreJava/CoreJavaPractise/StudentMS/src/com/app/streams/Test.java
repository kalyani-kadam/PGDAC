package com.app.streams;

import com.app.core.*;

import static utils.StudentCollectionUtils.populateList;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {1,2,4,5,9,393,-90,204};
		
//		attach IntStream to the array
//		System.out.println(Arrays.stream(data)); //java.util.stream.IntPipeline$Head@6a6824be
		
//		source (int[]) --> terminal operation(forEach)
		System.out.println("======== all int no =========");
		Arrays.stream(data) //source : IntStream  //streaming data from int array to stream
		.forEach(i -> System.out.print(i+" ")); //terminal operation
		
		System.out.println("\n======== Even no =========");
		Arrays.stream(data)  //src: IntStream -- all ints
		.filter(i -> i%2 == 0 ) //IntStream -- even nos
		.forEach(i -> System.out.print(i+ " ")); //terminal operation
		
		System.out.println("\n====Display student list====");
		List<Student> student = populateList();
		student.forEach(s -> System.out.println(s));
		
//		2.1 Create stream of ints between 1-100 & display all even elements.
		System.out.println("\nEven no bet 1 to 100");
		IntStream.rangeClosed(1, 100)
		.filter(j-> j % 2  == 0)
		.forEach(i -> System.out.print(i+" "));
		
//		Display average of all odd no between 1-100 .
		System.out.println("\nOdd no bet 1-100");
		IntStream.range(1, 100)
		.filter(j -> j % 2 != 0)
//		.sum()
		.forEach(i -> System.out.print(i +" "));
	}
}
