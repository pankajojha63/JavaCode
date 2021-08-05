package thread;

public class OddEvenImpl {
	public static void main(String[] args) {
		OddEven oe = new OddEven();
		oe.N = 15;
		Thread t1 = new Thread() {
			public void run() {
				try {
					oe.printOdd();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				try {
					oe.printEven();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		t1.start();
		t2.start();
	}
}
