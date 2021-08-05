package thread;

public class OddEven {
	static int N;
	int counter = 1;

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
