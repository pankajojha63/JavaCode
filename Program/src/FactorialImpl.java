
public class FactorialImpl {
	public static void main(String[] args) {
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		System.out.println(obj1);
		System.out.println(obj2);
	}

}

class Singleton {

	private Singleton() {

	}

	private static Singleton instance = null;

	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

}

// n!/(n-r)!