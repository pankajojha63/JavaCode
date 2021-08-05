
class A12 {
	public  void m1() {
		System.out.println("A m1");
	}
	
	public void m2() {
		System.out.println("A m2");
	}

}

public class Program30 extends A12 {

	public void m1() {
		System.out.println("B m1");
	}
	
	public static void main(String[] args) {
		A12 a= new Program30();
		a.m1();//B m1
		a.m2();//A m2
		
		
		Program30 b= new Program30();
		b.m1();
		b.m2();
	}
}

