package tester;

import static utils.ShopUtils.*;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.shop.core.Category;
import com.shop.core.Product;

public class TestShop4 {

	public static void main(String[] args) {
		
			System.out.println("Un sorted Products in the shop");
			List<Product> productList = populateProductList();
			productList.forEach(p -> System.out.println(p));
			System.out.println("sorted list as per desc date");
			//functional literal
			Comparator<Product> productComp=(p1,p2)-> 
			p2.getManufactureDate().compareTo(p1.getManufactureDate());
			
			Collections.sort(productList,productComp);
			productList.forEach(p -> System.out.println(p));
			
		
		
		
		

	}

}
