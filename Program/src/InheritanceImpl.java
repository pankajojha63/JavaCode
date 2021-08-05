
public class InheritanceImpl implements AS1,AS2 {
	public static void main(String[] args) {
		AS1 as1  = new InheritanceImpl();
		AS2 as2  = new InheritanceImpl();
		as1.show();
		as2.show();
		
		
	}

	public void show() {
		System.out.println("Show");
	}
}

interface AS1 {
	default void show() {
		System.out.println("As1 Show");
	}

	static void display() {
		System.out.println("As1 display");
	}

}

interface AS2 {
	default void show() {
		System.out.println("As2 Show");
	}

	static void display() {
		System.out.println("As2 display");
	}

}