package com.streams;
//package StudentMS;
import java.util.Arrays;
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
		
		System.out.println("====Display student list====");
//		Arrays.stream(Students);
		
	}

}
