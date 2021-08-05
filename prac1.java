
public class prac1 {
	public static void main(String[] args) {
		C c = new C();
		c.m1();
	}

}

class A {

	void m1() {
		System.out.println("A");
	}
}

class B extends A {
	void m1() {
		System.out.println("B");
	}
}

class C extends B {
	void m1() {
		super.m1();
		System.out.println("C");
	}
}
