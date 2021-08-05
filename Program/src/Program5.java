
public class Program5 extends AA {
	public static void main(String[] args) {
		AA p = new Program5();
		p.m1();
		p.m2();
		
		AA obj = new AA();
		Program5 a = (Program5) obj; //RTE --class Cast Exception
		a.m3();
		a.m2();
		a.m1();
		
	}

	void m3() {
		System.out.println(" m3");
	}
}

class AA {
	void m1() {
		System.out.println("A m1");
	}

	void m2() {
		System.out.println("A m2");
	}
}