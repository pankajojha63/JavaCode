package arrays.sort;

import java.util.Arrays;

public class ArraySortImpl {
	public static void main(String[] args) {
		int first[] = { 1, 2, 3, 4, 5 };
		int second[] = { 9, 2, 7, 1, 8 };

		// sort this array into 3rd array
		int length = first.length + second.length;
		int[] third = new int[length];
		int index = 0;
		for (int i = 0; i < length; i++) {
			if (i < first.length)
				third[i] = first[i];
			else {
				third[i] = second[index];
				index++;
			}
		}
		sortArray(third);
	}

	private static void sortArray(int[] third) {
		int temp = 0;
		for (int i = 0; i < third.length; i++) {
			for (int j = i + 1; j < third.length; j++) {
				if (third[i] > third[j]) {
					temp = third[i];
					third[i] = third[j];
					third[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(third));
	}

}
