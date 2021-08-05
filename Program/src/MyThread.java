
public class MyThread {
	public static void main(String[] args) {

		C c1 = new C();

		Thread t1 = new Thread() {
			public void run() {
				c1.update(1);
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				c1.read(1);
			}
		};

		t1.start();
		t2.start();
	}

}

class C {

	public synchronized void update(int id) {
		System.out.println("update data");
	}

	public synchronized void read(int id) {
		System.out.println("read data");
	}

}