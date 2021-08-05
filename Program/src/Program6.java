
public class Program6 extends AAA {
	static {
		System.out.println("SIB Program6");
	}
	{
		System.out.println("IIB Program6");
	}

	Program6() {
		System.out.println("Program6()");
	}

	public static void main(String[] args) {
		AAA a = new Program6();
		System.out.println("------------");
		new Program6();

	}
}

class AAA {
	static {
		System.out.println("SIB AAA");
	}
	{
		System.out.println("IIB AAA");
	}

	AAA() {
		System.out.println("AAA()");
	}
}