public class Program24 {
	public static void main(String[] args) {

		Sharable s1 = new Sharable();

		Thread t1 = new Thread() {
			@Override
			public void run() {
				s1.method1();
			}
		};

		Thread t2 = new Thread() {
			@Override
			public void run() {
				s1.method3();
			}
		};
		
		t1.start();
		t2.start();

	}
}

class Sharable {

	public synchronized void method1() {
		System.out.println("method1");
	}

	public static synchronized void method2() {
		System.out.println("method2");
	}

	public synchronized void method3() {
		System.out.println("method3");
	}
}