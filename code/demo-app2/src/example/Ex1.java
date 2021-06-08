package example;

import java.util.Scanner;

/*
 * 
 *  s/w
 *  
 *  	-> computational
 *      -> io
 * 
 * 
 */

public class Ex1 {

	public static void io() {
		String tName = Thread.currentThread().getName();
		System.out.println(tName + " started io..");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hello " + scanner.nextLine());
		scanner.close();
		System.out.println(tName + " finished io");
	}

	public static void computation() {
		String tName = Thread.currentThread().getName();
		System.out.println(tName + " started computation..");
		long v = 0;
		for (int i = 0; i < 100000000000L; i++) {
//			System.out.println(".");
			v++;
		}
		System.out.println(tName + " finished computation");
	}

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getName());

		Thread ioThread = new Thread(() -> {
			io();
		},"IO");

		Thread computationThread = new Thread(() -> {
			computation();
		},"COMPUTATION");

		ioThread.start(); // NewStack , -Xss=1m
		computationThread.start();
	}

}
