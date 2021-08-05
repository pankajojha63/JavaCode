package creational;

public class SynchronizedSingleton {
	private static SynchronizedSingleton Instance1 = null;
	private static volatile SynchronizedSingleton Instance2 = null;

	private SynchronizedSingleton() {

	}

	//First way
	public synchronized static SynchronizedSingleton getInstance1() {
		if (Instance1 == null) {
			Instance1 = new SynchronizedSingleton();
		}
		return Instance1;
	}

	
	//2nd way
	public static SynchronizedSingleton getInstance2() {
		if (Instance2 == null) {
			synchronized (SynchronizedSingleton.class) {
				if (Instance2 == null) {
					Instance2 = new SynchronizedSingleton();
				}
			}
		}
		return Instance2;
	}
}
