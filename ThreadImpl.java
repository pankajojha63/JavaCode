
public class ThreadImpl extends Thread {
	public static void main(String[] args) {
		OddEven oe = new OddEven();
		oe.N=10;
		ThreadImpl t1 = new ThreadImpl() {
			public void run() {
				try {
					oe.printOdd();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		ThreadImpl t2 = new ThreadImpl() {
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
	int counter=1;
	static int N ;
	
	synchronized void printOdd() throws InterruptedException {
		while (counter < N) {
			if (counter % 2 == 1) {
				wait();
			}
			System.out.println(counter);
			counter++;
			notify();
		}
	}

	synchronized void printEven() throws InterruptedException {
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