package example;

public class CMHarness {

	public static void main(String[] args) throws InterruptedException {

		CustomerManager cm = new CustomerManager();
		GenerateCustomerTask generateCustomerTask = new GenerateCustomerTask(cm);
		ProcessCustomerTask processCustomerTask = new ProcessCustomerTask(cm);

		for (int user = 0; user < 10; user++) {
			Thread thread = new Thread(generateCustomerTask);
			thread.start();
		}
		
		Thread thread=new Thread(processCustomerTask);
		thread.start();
		
		//

		while (true) {
			Thread.sleep(5000);
			cm.howManyCustomers();
			System.out.println("Available Memory : "+Runtime.getRuntime().freeMemory()/1024+"K");
		}

	}

}
