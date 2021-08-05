import java.util.Arrays;

public class TryCatchImpl {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 3, 5, 6, 6, 6, 10, 10, 12 };
		int b = 11;
		int c[] = new int[2];
		int firstIndex = 0;
		int lastIndex = 0;
		boolean isPresentflag = false;

		int length = a.length; // 11
		for (int i = 0; i < length; i++) {
			if (b == a[i]) {
				if (!isPresentflag) {
					isPresentflag = true;
					firstIndex = i;
				}
				lastIndex = i;
			}
		}

		if (isPresentflag) {
			c[0] = firstIndex;
			c[1] = lastIndex;
		} else {
			c[0] = -1;
			c[1] = -1;
		}
		System.out.println(Arrays.toString(c));
	}

}
