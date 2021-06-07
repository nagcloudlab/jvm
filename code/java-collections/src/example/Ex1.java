package example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import example.model.Product;
import example.model.ProductType;

public class Ex1 {

	public static void main(String[] args) {

		List<Product> products = new ArrayList<Product>();
		products.add(new Product(23123, "product-1", 100.00, ProductType.ELEC));
		products.add(new Product(34534, "product-2", 200.00, ProductType.OTHER));
		products.add(new Product(85675, "product-4", 400.00, ProductType.OTHER));
		products.add(new Product(54566, "product-5", 300.00, ProductType.ELEC));
		products.add(new Product(13123, "product-3", 300.00, ProductType.ELEC));
//
//		Collections.sort(products);
//		
//		products
//		.forEach(System.out::println);
//		
		Comparator<Product> byPrice=(p1,p2)->Double.compare(p1.getPrice(), p2.getPrice());
//		Comparator<Product> byName=(p1,p2)->p1.getName().compareTo(p2.getName());
		Comparator<Product> byName=Comparator.comparing(Product::getName);
		Comparator<Product> byPriceAndThenName=byPrice.thenComparing(byName);
		
		Collections.sort(products,byPriceAndThenName);
		

		products
		.forEach(System.out::println);

	}

}
