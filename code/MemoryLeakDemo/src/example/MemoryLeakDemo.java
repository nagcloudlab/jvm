package example;

public class MemoryLeakDemo {
	static Object1 object1 = new Object1();

	public static void main(String[] args) {
		try {
			object1.grow();
		} catch (Throwable e) {
			System.out.println(e);
		}
	}

}
