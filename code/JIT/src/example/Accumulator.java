package example;

import java.util.Date;

public class Accumulator {

	public static void main(String[] args) {
		Date start = new Date();
		int max = Integer.parseInt(args[0]);
		System.out.println(addAll(max));
		Date end = new Date();
		System.out.println("elapsed time " + (end.getTime() - start.getTime()));
	}

	static int addAll(int max) {
		int accum = 0;
		for (int i = 0; i < max; i++) {
			accum = add(accum, i);
		}
		return accum;
	}

	static int add(int a, int b) {
		return a + b;
	}

}