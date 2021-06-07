package example;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;

public class Ex1 {

	public static void main(String[] args) throws Exception {

		Runtime runtime = Runtime.getRuntime();

		long availableMemory = runtime.freeMemory();
		System.out.println("Available Memory at start " + availableMemory / 1024 + "K");

		for (int i = 0; i < 100; i++) {
			Customer customer = new Customer("Customer " + i);
		}

		availableMemory = runtime.freeMemory();
		System.out.println("Available Memory when customers created " + availableMemory / 1024 + "K");

		availableMemory = runtime.freeMemory();
		System.out.println("Available Memory when customers no longer referenced " + availableMemory / 1024 + "K");

		TimeUnit.SECONDS.sleep(1);

		availableMemory = runtime.freeMemory();
		System.out.println("Available memory 1 seconds later " + availableMemory / 1024 + "K");

		System.gc();

		availableMemory = runtime.freeMemory();
		System.out.println("Available memory after GC command " + availableMemory / 1024 + "K");

	}

}
