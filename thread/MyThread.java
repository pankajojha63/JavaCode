package thread;

public class MyThread extends Thread{
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		//t1.setName("Child Thread 1");
		t1.start();
		t1.setName("Child Thread 1");
		
		for(int i=0;i<5;i++){
			System.out.println("Main :: "+Thread.currentThread().getPriority());
		}
	}
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println(Thread.currentThread().getName());
			System.out.println("isDaemon :: "+Thread.currentThread().isDaemon());
			System.out.println("Priority :: "+Thread.currentThread().getPriority());
		}
	}
}
