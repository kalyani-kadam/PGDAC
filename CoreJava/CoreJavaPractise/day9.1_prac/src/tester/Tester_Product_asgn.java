package tester;

import static utils.ShopUtils.populateProductList;
import static utils.ShopUtils.populateProductMap;

import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.IntStream;

import com.shop.core.Category;
import com.shop.core.Product;

public class Tester_Product_asgn {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){
		/*
		 * 2.3 Display all product names of a particular category , exceeding specific
		 * price. I/P category name & price.
		 */ 
		Map<Integer,Product> pmap = populateProductMap(populateProductList());
//		List<Product> plist = populateProductList();
		
		pmap.forEach((k,p1) -> System.out.println(p1));
		
		System.out.println("Enter category:");
		Category chosencat = Category.valueOf(sc.next().toUpperCase());
		
		pmap.values().stream()
		.filter(p -> p.getProductCategory() == chosencat)
		.filter(p -> p.getPrice() > 10)
		.forEach(p -> System.out.println("Name: "+p.getName()+" Price: "+p.getPrice()));
		
		 /* 2.4 Prompt user for category n discount. Apply that discount on all products
		 * of specified category n print it.
		 */
//		System.out.println("Enter discount: ");
//		pmap.values().stream()
//		.filter(p -> p.getProductCategory() == chosencat);
//		.
		 /* 2.5 Display average of all odd nos between 1-100 .*/
		
		int sum = IntStream.rangeClosed(1, 100)
		.filter(n -> n%2 != 0)
		.sum();
		
		long cnt = IntStream.rangeClosed(1, 100)
				.filter(n -> n%2 != 0)
				.count();
		
		System.out.println("Average of odd no: "+sum/cnt);
		
		
		
		/* 2.7 Sort products of a specific category as per manufacture date n price n
		 * display their names. i/p category name
		 */
		
//		Comparator<Product> prod = (s1,s2) ->
//		Comparator<Product> compprice = (s1,s2) ->
//		s1.getPrice().compareTo(s2.getPrice());
		
		System.out.println("sort products of a specific category as per manufacture date n price");
		Comparator<Product> compdate = (s3,s4) ->
		s3.getManufactureDate().compareTo(s4.getManufactureDate());			
		
		pmap.values().stream()
		.filter(p -> p.getProductCategory() == chosencat)
		.sorted(Comparator.comparingDouble(p -> p.getPrice()))
		.sorted(compdate)
		.forEach(p -> System.out.println(p.getName()));
		
		
//		Display average of product prices of a specific category.
//		I/P category name
//		o/p average
		
		Double sum1= pmap.values().stream()
		.filter(p -> p.getProductCategory() == chosencat)
		.mapToDouble(p-> p.getPrice())
		.sum();
		
		double cntp = pmap.values().stream()
				.filter(p -> p.getProductCategory() == chosencat)
				.count();
		
		System.out.println("Average of product prices: "+sum1/cntp);
		
//		Sort products of a specific category as per price n display their names.
//		i/p category name
		
//		Comparator<Product> pcat = (k1,k2) ->
//		k1.getPrice().compareTo(k2.getPrice());
		
		System.out.println("Sort products of a specific category as per price n display their names");
		pmap.values().stream()
		.filter(p -> p.getProductCategory() == chosencat)
		.sorted(Comparator.comparingDouble(p ->p.getPrice()))
		.forEach(p -> System.out.println(p.getName()));
		
		
//		Display sum of product prices of a specific category.
//		I/P category name
//		Products are stored in a map
//		o/p sum.
		
		double sumofprice = pmap.values().stream()
		.filter(p -> p.getProductCategory() == chosencat)
		.mapToDouble(p ->p .getPrice())
		.sum();
		
		System.out.println("Display sum of product prices of a specific category: "+sumofprice);
		
//		Display all product names of a particular category , exceeding specific price.
//		I/P category name & price.

		
		System.out.println("all product names of a particular category , exceeding specific price");
		System.out.println("Enter price: ");
		pmap.values().stream()
		.filter(p -> p.getProductCategory() == chosencat)
		.filter(p -> p.getPrice() > sc.nextDouble())
		.forEach(p ->System.out.println(p.getName()));
		
	}catch(Exception e) {
		System.out.println(e);
	}
	}
}
