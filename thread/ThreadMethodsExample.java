package thread;

public class ThreadMethodsExample {
	public static void main(String[] args) throws InterruptedException {
		NewThread t1 = new NewThread();
		NewThread t2 = new NewThread();
		t1.start();
		//t2.setPriority(6);
		//t1.join();
		Thread.yield();
		t2.start();
	}
}

class NewThread extends Thread{
	@Override
	public void run() {
		for(int i=0;i<5;i++){
			System.out.println("Child thread :: "+ Thread.currentThread().getName());
		}
	}
}
