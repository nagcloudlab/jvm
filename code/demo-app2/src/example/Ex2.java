package example;

public class Ex2 {

	public static void main(String[] args) throws InterruptedException {

//		Thread.sleep(20*1000);

		Object lock = new Object();
		synchronized (lock) {
			lock.wait(20 * 1000);
		}

	}

}
