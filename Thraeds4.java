
public class Thraeds4 {
	public static void main(String[] args) {
		new Thraeds4().go();
	}

	private void go() {
		Runnable r = new Runnable() {
			@Override
			public void run() {
				System.out.println("foo");
			}
		};
		Thread t = new Thread(r);
		t.start();
		t.start();
	}

}
