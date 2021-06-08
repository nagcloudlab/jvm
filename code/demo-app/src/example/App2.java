package example;

import java.util.ArrayList;
import java.util.List;

public class App2 {

	public static void main(String[] args)throws InterruptedException {

		List<Customer> customers = new ArrayList<Customer>();
		while (true) {
			Customer customer = new Customer("nag");
			customers.add(customer);
			if (customers.size() > 100) {
				for (int i = 0; i < 10; i++) {
//					customers.remove(0);
				}
			}
//			Thread.sleep(1000);
		}

	}

}
