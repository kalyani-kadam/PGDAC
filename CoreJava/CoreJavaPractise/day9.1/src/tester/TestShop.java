package tester;

import static utils.ShopUtils.*;

import java.util.List;
import java.util.Map;

import com.shop.core.Product;

public class TestShop {

	public static void main(String[] args) {
		System.out.println("Products in the shop : using List");
		List<Product> productList = populateProductList();
		productList.forEach(p -> System.out.println(p));
		// display the products from the Map
		Map<Integer, Product> productMap = populateProductMap(productList);
		// Objective : Display product id n product name n price from the product map
		// (using functional prog )

		System.out.println("Products in the shop : using Map");
		productMap
				.forEach((k, v) -> System.out.println("PID " + k + " Name " + v.getName() + " Price " + v.getPrice()));
	}

}
