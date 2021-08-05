package thread;

public class OddEvenDemo extends Thread{
	public static void main(String[] args) {
		OddEven oe = new OddEven();
		OddEven.N=6;
		
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				oe.printEven();
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				oe.printOdd();
			}
		});
		
		t1.start();
		t2.start();
		
	}
}

class OddEven{	
	int counter =1;
	static int N;
	void printOdd(){
		 synchronized(this){
			 while (counter<N){
				 if(counter%2==1){
					 try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				 }
				 System.out.print(counter + " ");
				 counter++;
				 notify();
			 }
		 }
	}
	
	void printEven(){
		synchronized(this){
			 while (counter<N){
				if(counter%2==0){
					 try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				 }
				System.out.print(counter + " ");
				 counter++;
				 notify();
			 }
		 }
	}
}

