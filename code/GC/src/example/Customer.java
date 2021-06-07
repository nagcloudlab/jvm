package example;

public class Customer {

	public Customer(String name) {
		super();
		this.name = name;
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + "]";
	}

	
//	@Override
//	protected void finalize() throws Throwable {
//		System.out.println("This object is being g.c'd" + name);
//		// cleaning....
//		while(true) {}
//	}

}
