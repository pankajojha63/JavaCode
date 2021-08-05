
public class InterfaceMethod implements interf, interf1 {
	public static void main(String[] args) {
		interf.statictest();
		InterfaceMethod in = new InterfaceMethod();
		in.defaulttest();
	}

	@Override
	public void defaulttest() {
		System.out.println("child class");
	}	
	
}

interface interf {
	default void defaulttest() {
		System.out.println("Default method");
	}

	static void statictest() {
		System.out.println("Static method");
	}
}

interface interf1 {
	default void defaulttest() {
		System.out.println("Default method");
	}

	static void statictest() {
		System.out.println("Static method");
	}
}