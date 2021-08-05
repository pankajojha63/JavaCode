import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadCount implements Runnable {
	private static int counter = 0;
	private static final int limit = 30;
	private static final int threadPoolSize = 3;

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(threadPoolSize);
		for (int i = 0; i < threadPoolSize; i++) {
			executorService.submit(new ThreadCount());
		}
		executorService.shutdown();
	}

	@Override
	public void run() {
		while (counter < limit) {
			increaseCounter();
		}
	}

	private synchronized void increaseCounter() {
		System.out.println(Thread.currentThread().getName() + " : " + counter);
		counter++;
	}
}