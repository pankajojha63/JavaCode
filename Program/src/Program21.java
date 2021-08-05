
public class Program21 {
	public static void main(String[] args) {
		final String resource1 = "Thread1";
		final String resource2 = "Thread2";

		Thread t1 = new Thread() {
			public void run() {
				synchronized (resource1) {
					System.out.println("resource1 Thread1");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					synchronized (resource2) {
						System.out.println("resource2 Thread1");
					}
				}
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				synchronized (resource1) {
					System.out.println("resource2 Thread2");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					synchronized (resource2) {
						System.out.println("resource1 Thread2");
					}
				}
			}
		};

		t1.start();
		t2.start();
	}
}
