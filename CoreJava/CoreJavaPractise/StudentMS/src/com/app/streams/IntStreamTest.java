package com.app.streams;

import java.util.stream.IntStream;

public class IntStreamTest {

	public static void main(String[] args) {
		// create stream of ints in range 1-50 n display all nos
		System.out.println("all no 1-50");
		IntStream.range(1, 51) //range exclusive
		.forEach(i -> System.out.print(i+" "));

//		create stream of odd ints in range 1 -50
		System.out.println("\nodd no 1-50"); //range inclusive
		IntStream.rangeClosed(1, 50) //src
		.filter(i -> i % 2 != 0) //intermediate operation
		.forEach(i -> System.out.print(i + " ")); //terminal operation
		
//		create sum of squares of the even no bet 1-100
		
		int result = IntStream.rangeClosed(1, 100)
		.filter(i -> i %2 == 0) //intstream:evens
		.map(i -> i*i)			//intstream:evens
		.sum();						//terminal op:reduce
		System.out.println("\nSum of squares 1-100: "+result);
//		.forEach(i -> System.out.print(i+" "))
		
		
	}

}
