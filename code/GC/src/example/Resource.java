package example;

import java.io.Closeable;
import java.io.IOException;

public class Resource implements Closeable{

	public void init() {
		//..
	}
	
	public void use() {
		//..
	}
	
	@Override
	public void close() throws IOException {
		// cleaning....
		System.out.println("close..");
	}
	
}
