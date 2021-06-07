package example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class MyList<E> implements Iterable<E> {
	// ...
	public void add(E e) {
		//..
	}
	@Override
	public Iterator<E> iterator() {
		return new Iterator<E>() {
			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return false;
			}
			@Override
			public E next() {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}
}

public class Q {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");

		for (String str : list) {
			System.out.println(str);
		}

		List<String> list2 = new LinkedList<String>();
		list2.add("A");
		list2.add("B");
		list2.add("C");

		for (String str : list2) {
			System.out.println(str);
		}

		MyList<String> list3 = new MyList<>();

		for (String str : list3) {
			System.out.println(str);
		}

	}

}
