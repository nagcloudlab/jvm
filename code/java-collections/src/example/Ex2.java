package example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

import example.model.Product;
import example.model.ProductType;

public class Ex2 {

	public static void main(String[] args) {

		List<Product> products = new ArrayList<Product>();
		products.add(new Product(23123, "product-1", 100.00, ProductType.ELEC));
		products.add(new Product(34534, "product-2", 200.00, ProductType.OTHER));
		products.add(new Product(13123, "product-3", 300.00, ProductType.ELEC));
		products.add(new Product(85675, "product-4", 400.00, ProductType.OTHER));
		products.add(new Product(54566, "product-5", 500.00, ProductType.ELEC));

		// ---------------------------------------------------------------------
		// 1. External Iteration
		// ---------------------------------------------------------------------
		// get elec product into new list

//		List<Product> elecProducts = new ArrayList<Product>();
//
//		for (Product product : products) {
//			if (product.getType().equals(ProductType.ELEC)) {
//				elecProducts.add(product);
//			}
//		}
//
//
//		for (Product elecProduct : elecProducts) {
//			System.out.println(elecProduct);
//		}

		// ---------------------------------------------------------------------
		// 2. Internal Iteration ==> using stream api
		// ---------------------------------------------------------------------

		System.out.println(
		
				products
				//.stream() // build streams
				.parallelStream()
				.filter(product->product.getType().equals(ProductType.ELEC)) // intermediate oprns
				.map(Product::getName)
				.map(String::toUpperCase)
				.collect(Collectors.toList()) // terminate stream
				
				
		);
		
		//--------------------------------------------------------------------------
	}

}
