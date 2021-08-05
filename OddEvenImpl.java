
public class OddEvenImpl {
	public static void main(String[] args) {
		OddEven oe = new OddEven();
		oe.N = 10;
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

class OddEven {
	static int N;
	int counter = 1;

	public synchronized void printOdd() throws InterruptedException {
		while (counter < N) {
			if (counter % 2 == 1) {
				wait();
			}
			System.out.println(counter);
			counter++;
			notify();
		}
	}

	public synchronized void printEven() throws InterruptedException {
		while (counter < N) {
			if (counter % 2 == 0) {
				wait();
			}
			System.out.println(counter);
			counter++;
			notify();
		}
	}
}
