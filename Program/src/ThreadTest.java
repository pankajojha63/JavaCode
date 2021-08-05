import java.util.concurrent.CountDownLatch;

public class ThreadTest extends Thread {
	public static void main(String args[]) {
		// Set the counter to 2 being two applications
		CountDownLatch countDownLatch = new CountDownLatch(3);

		Thread app1 = new Thread(new Application("App1", countDownLatch));
		Thread app2 = new Thread(new Application("App2", countDownLatch));
		Thread app3 = new Thread(new Application("App3", countDownLatch));

		// initialize applications
		app1.start();
		app2.start();
		app3.start();

		try {
			// wait until countDownLatch reduces to 0.
			countDownLatch.await();
			// As all applications are up, print the message
			System.out.println("All applications are up and running.");
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
}

class Application implements Runnable {
	private String name;
	private CountDownLatch countDownLatch;

	public Application(String name, CountDownLatch countDownLatch) {
		this.name = name;
		this.countDownLatch = countDownLatch;
	}

	public void run() {
		try {
			System.out.println(name + " started. ");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(name + " is Up and running." + countDownLatch.getCount());
		// reduce the count by 1
		countDownLatch.countDown();
	}
}