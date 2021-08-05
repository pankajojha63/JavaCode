import java.util.Arrays;

public class Program25 {
	public static void main(String[] args) {
		int[] a = { 1, 3, 5, 7, 9 };
		int[] b = { 2, 4, 6, 8, 10 };

		mergeArray(a, b);
	}

	private static void mergeArray(int[] a, int[] b) {
		int len1 = a.length;
		int len2 = b.length;

		int[] c = new int[len1 + len2];
		for (int i = 0; i < (len1 + len2); i++) {
			int k = 0, j = 0;
			while (k < len1 && j < len2) {
				if (a[k] < b[j]) {
					c[i++] = a[k++];
				} else {
					c[i++] = b[j++];
				}
			}
		}

		System.out.println(Arrays.toString(c));
	}
}