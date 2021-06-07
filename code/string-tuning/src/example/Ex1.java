package example;

public class Ex1 {

	public static void main(String[] args) {
		
		String s1="hello";
		String s2="hello";
		
		System.out.println(s1==s2);
		
		
		
		Integer integer=new Integer(123);
		String s3=integer.toString().intern();
		
		String s4="123";
		
		System.out.println(s3==s4);
		
		
	}
	
}
