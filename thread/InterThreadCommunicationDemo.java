package thread;

public class InterThreadCommunicationDemo {
	public static void main(String[] args) {
		Calculator calthread = new Calculator();
		calthread.start();
		
		synchronized (calthread) {
			try {
				calthread.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(calthread.sum);
		
		System.out.println("Execution done");
	}
}

class Calculator extends Thread{
	int sum=0;
	public void run() {
		synchronized (this) {
			for(int i=0;i<100;i++){
				sum += i;
			}
			notify();
		}
	}
}