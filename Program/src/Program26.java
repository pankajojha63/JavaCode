
public class Program26 {
	public static void main(String[] args) {
		int n = -1;
		printPrimeNumber(n);
	}

	private static void printPrimeNumber(int n) {
		int counter = 1;

		if (n == 1)
			System.out.println(2);
		else if(n>1){
			System.out.print(2);
			int i = 3;
			while (counter < n) {
				boolean primeflag = true;

				for (int j = 2; j < i; j++) {
					if (i % j == 0) {
						primeflag = false;
						break;
					}
				}
				if (primeflag) {
					System.out.print(" " + i);
					counter++;
				}
				i++;

			}
		}
	}
}