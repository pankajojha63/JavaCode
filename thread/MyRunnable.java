package thread;

public class MyRunnable implements Runnable{
	public void run() {
		System.out.println("Calling run method");
	}
	public static void main(String[] args) {
		MyRunnable r = new MyRunnable();
		Thread t=  new Thread(r);
		t.start();
	}
}
