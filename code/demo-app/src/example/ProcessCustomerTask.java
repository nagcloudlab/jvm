package example;

import java.util.Optional;

public class ProcessCustomerTask implements Runnable {

	CustomerManager cm;

	public ProcessCustomerTask(CustomerManager cm) {
		super();
		this.cm = cm;
	}

	@Override
	public void run() {

		while (true) {
			Optional<Customer> customer = cm.nextCustomer();
			if (!customer.isPresent()) {
				// ..
				try {
					Thread.sleep(50);
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else {
				// ..
			}
		}

	}

}
