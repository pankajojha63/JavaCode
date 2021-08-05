package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
	public static void main(String[] args) {
		ExecutorService ex = Executors.newFixedThreadPool(5);
		ex.execute(new ChildThread());
		ex.shutdown();
	}
}
class ChildThread extends Thread{
	public void run(){
		System.out.println("child Thread");
	}
}
