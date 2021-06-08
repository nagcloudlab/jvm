package example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public class CustomerManager {

	private volatile List<Customer> customers = new ArrayList<Customer>();

	private int nextAvailableId = 0;
	private int lastProcessedId = -1;

	public void addCustomer(Customer customer) {
		synchronized (this) {
			customer.setId(nextAvailableId);
			synchronized (customers) {
				customers.add(customer);
			}
			nextAvailableId++;
		}
	}

//
//	public Optional<Customer> nextCustomer() {
//		if (lastProcessedId + 1 > nextAvailableId) {
//			lastProcessedId++;
//			return Optional.of(customers.get(lastProcessedId));
//		}
//		return Optional.empty();
//	}
//
	public Optional<Customer> nextCustomer() {
		synchronized (customers) {
			if (customers.size() > 0) {
				return Optional.of(customers.remove(0));
			}
		}
		return Optional.empty();
	}

	public void howManyCustomers() {
		int size = 0;
		size = customers.size();
		System.out.println("" + new Date() + " Customers in queue :" + size + " of " + nextAvailableId);
	}
}
