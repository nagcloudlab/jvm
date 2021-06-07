package example;

import java.util.UUID;

public class GenerateCustomerTask implements Runnable {

	private CustomerManager cm;

	public GenerateCustomerTask(CustomerManager cm) {
		super();
		this.cm = cm;
	}

	@Override
	public void run() {

		while (true) {
			try {
				Thread.sleep(2);
			} catch (Exception e) {
				e.printStackTrace();
			}
			String name = UUID.randomUUID().toString();
			Customer customer = new Customer(name);
			cm.addCustomer(customer);
		}

	}

}
