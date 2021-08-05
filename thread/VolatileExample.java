package thread;

public class VolatileExample {
	public static void main(String[] args) throws InterruptedException {
		VolatileThread t1 = new VolatileThread();
		t1.start();
		Thread.sleep(2000);
		t1.stopRunning();
	}

}

class VolatileThread extends Thread {
	private volatile boolean isRunning = true;
	private int counter = 1;

	@Override
	public void run() {
		while (isRunning) {
			System.out.println(counter);
			counter++;
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void stopRunning(){
		isRunning = false;
	}
}