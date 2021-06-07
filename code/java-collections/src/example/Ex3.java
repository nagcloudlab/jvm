package example;

import java.util.LinkedHashSet;
import java.util.Set;

import example.model.Product;
import example.model.ProductType;

public class Ex3 {

	public static void main(String[] args) {

//		Set<Product> products = new TreeSet<Product>(Comparator.comparing(Product::getName));
//		Set<Product> products = new HashSet<Product>();
		Set<Product> products = new LinkedHashSet<Product>();
		products.add(new Product(23123, "product-1", 100.00, ProductType.ELEC));
		products.add(new Product(34534, "product-2", 200.00, ProductType.OTHER));
		products.add(new Product(13123, "product-3", 300.00, ProductType.ELEC));
		products.add(new Product(54566, "product-5", 500.00, ProductType.ELEC));
		
		Product p41= new Product(85675, "product-4", 400.00, ProductType.OTHER);
		Product p42= new Product(85675, "product-4", 400.00, ProductType.OTHER);
		
		System.out.println(p41.hashCode());
		System.out.println(p42.hashCode());
		
		
		System.out.println(p41.equals(p42));
		
		products.add(p41);
		products.add(p42);
		
		products
		.forEach(System.out::println);

	}

}
