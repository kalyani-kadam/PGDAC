package tester;

import static utils.ShopUtils.*;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.shop.core.Category;
import com.shop.core.Product;

public class TestShop3 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Products in the shop : using Map");
			Map<Integer, Product> productMap = populateProductMap(populateProductList());
			productMap.forEach((k, v) -> System.out.println(v));
			System.out.println("Choose category");
			Category cat = Category.valueOf(sc.next().toUpperCase());
//			productMap.forEach((id, product) -> {
//				if (product.getProductCategory() == cat)
//					productMap.remove(id);
//			});
			productMap.values() //Collection<Product>
			.removeIf(p -> p.getProductCategory()==cat);
			System.out.println("Map after remove -");
			productMap.forEach((k, v) -> System.out.println(v));
			
		}

	}

}
