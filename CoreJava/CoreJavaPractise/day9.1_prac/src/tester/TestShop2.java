package tester;

import static utils.ShopUtils.*;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.shop.core.Category;
import com.shop.core.Product;

public class TestShop2 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Products in the shop : using List");
			List<Product> productList = populateProductList();
			productList.forEach(p -> System.out.println(p));
			System.out.println("Choose category");
			Category cat=Category.valueOf(sc.next().toUpperCase());
			boolean removed = productList.removeIf(p -> p.getProductCategory()==cat);
			System.out.println(removed);
			//display list after remove
			productList.forEach(p -> System.out.println(p));
		}

	}

}
