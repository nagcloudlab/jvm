package example;


class R1{
	public synchronized void m1(R2 r2) {
		System.out.println("T1 having R1");
		System.out.println("T1 trying R2");
		r2.m2();
	}
	public synchronized void m2() {
		System.out.println("T2 also having R1");
	}
}
class R2{
	public synchronized void m1(R1 r1) {
		System.out.println("T2 having R2");
		System.out.println("T2 trying R1");
		r1.m2();
	}
	public synchronized void m2() {
		System.out.println("T1 also having R2");
	}
}

public class Ex3 {
	
	public static void main(String[] args) {
		
		R1 r1=new R1();
		R2 r2=new R2();
		
		Thread t1=new Thread(()->{
			r1.m1(r2);
		});

		Thread t2=new Thread(()->{
			r2.m1(r1);
		});
		
		t1.start();
		t2.start();
		
		
		
	}

}
