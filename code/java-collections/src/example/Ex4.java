package example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Owner {
	String name;

	public Owner(String name) {
		super();
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Owner other = (Owner) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	

}

class Car {
	String model;
	String color;

	public Car(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", color=" + color + "]";
	}

}

public class Ex4 {

	public static void main(String[] args) {

		Owner owner1 = new Owner("Nag");
		Owner owner2 = new Owner("Riya");

		Car car1 = new Car("model-1", "white");
		Car car2 = new Car("model-2", "yellow");

		// ----------------------------------------------

		Map<Owner, Car> map = new HashMap<Owner, Car>();
		map.put(owner1, car1);
		map.put(owner2, car2);
		
		//-------------------------------------------------
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter owner name");
		String name=scanner.nextLine();
		
		Owner key=new Owner(name);
		Car car=map.get(key);
		if(car!=null) {
			System.out.println(car);
		}else {
			System.err.println("opps, u dont own car");
		}

	}

}
