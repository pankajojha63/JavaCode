import java.util.Arrays;

public class Program14 {
	public static void main(String[] args) {
		int[] a = { 1, 9, 8, 4, 6, 7, 3, 4, 2 };
		for (int i = 0; i < a.length; i++) {
			int temp = 0;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(a));
	}
}
