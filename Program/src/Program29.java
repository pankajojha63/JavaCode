
public class Program29 extends Thread {
	public static void main(String[] args) {
		Integer a = new Integer("123");
		Integer b = Integer.valueOf("123");

		/*System.out.println(a == b);
		System.out.println(a.equals(b));*/
		
		Program29 p1 = new Program29();
		
		p1.start();
		p1.start();
	}

	public void run() {
		try {
			System.out.println("thread is executing now........");
		} catch (Exception e) {
		}
	}
}
