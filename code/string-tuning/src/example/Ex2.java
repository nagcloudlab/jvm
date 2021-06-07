package example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Ex2 {

	public static void main(String[] args) {

		Date start = new Date();
		List<String> strings = new ArrayList<String>();
		for (Integer i = 0; i < 10000000; i++) {
			String s = i.toString().intern();
			strings.add(s);
		}
		Date end = new Date();
		System.out.println("Elapsed time " + (end.getTime() - start.getTime()) + "");
	}

}
