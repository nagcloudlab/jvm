package jit;

public class Accumulator {

	public static void main(String[] args) {
		int max = Integer.parseInt(args[0]);
		System.out.println(addAllSqrts(max));
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

	static double addAllSqrts(int max) {
		double accum = 0;
		for (int i = 0; i < max; i++) {
			accum = addSqrt(accum, i);
		}
		return accum;
	}

	static double addSqrt(double a, int b) {
		return a + sqrt(b);
	}

	static double sqrt(int a) {
		return Math.sqrt(a);
	}

}