package human;

public class HackerEarth1 {
	public static void main(String[] args) {
		Languages ab;
		for (Languages a : Languages.values()) {
			System.out.println(a + " " + a.getCoders() + " coders.");
		}
	}
}

enum Languages {
	Python(10), Java(9), Angular(12);
	private int coders;

	Languages(int p) {
		coders = p;
	}

	public int getCoders() {
		return coders;
	}

}