/*
 * package com.app.tester;
 * 
 * 
 * package tester;
 * 
 * //import tester.IOUtils.*; import static tester.IOUtils.*;
 * 
 * import java.util.Comparator; import java.util.Scanner; import
 * java.util.stream.Stream;
 * 
 * import com.app.details.Customer; //import static utils.CmsUtility.*;
 * 
 * public class StoreSortedCustomer {
 * 
 * public static void main(String[] args) { try(Scanner sc = new
 * Scanner(System.in)){ // 1 Solve // Suppose you have Customer details in a
 * map. Can you store these details sorted as per name in a text file , in a
 * buffered manner ?
 * 
 * // Map<String,Customer> stud = populateCustomer();
 * 
 * Comparator<Customer> comp = (s1,s2) -> s1.getName().compareTo(s2.getName());
 * 
 * Stream<Customer> sortedStream = stud.values() //Collection<Customer>
 * .stream() //Stream<Customer> .sorted(comp); //intermediate operation
 * 
 * System.out.println("Enter file name to store details: "); //invoke IOUtils
 * method to write the details in a text file
 * writeDetails(sortedStream,sc.nextLine()); System.out.println("data stored");
 * 
 * }//sc.close() catch (Exception e) { System.out.println(e); }
 * System.out.println("main over..."); }
 * 
 * }
 * 
 */