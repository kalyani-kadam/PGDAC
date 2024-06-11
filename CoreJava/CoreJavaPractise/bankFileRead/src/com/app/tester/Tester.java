package com.app.tester;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Tester {
	public static void main(String[] args) {
		System.out.println("enter file name");
		try (// sc
				Scanner sc = new Scanner(System.in);
				
				// Java App <--- BR <-----FR <---src text file
				BufferedReader br = new BufferedReader
						(new FileReader(sc.nextLine()))) {
			br.lines() //Stream<String> : lines from buffer of BR
			.map(s -> s.toUpperCase())
			.forEach(line -> System.out.println(line));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
