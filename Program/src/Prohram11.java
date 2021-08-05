
public class Prohram11 {
	public static void main(String[] args) {
		int n = 10;
		for (int i = 1; i <= n; i++) {
			if (i <= n / 2) {
				System.out.print(i + " ");
			} else {
				System.out.println();
				int counter = 0;
				while (counter < (n / 2 -1)) {
					System.out.print("  ");
					counter++;
				}
				System.out.print(i);
			}
		}
	}
}
