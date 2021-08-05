package arrays;

import java.util.Arrays;

public class ZeroOneArrExample {
	public static void main(String[] args) {
		int[] arr = { 0, 1, 1, 0, 1, 0 };
		int counter = 0;
		for (Integer i : arr) {
			if (arr[i] == 0) {
				counter = counter + 1;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (i < counter) {
				arr[i] = 0;
			} else
				arr[i] = 1;
		}
		System.out.println(Arrays.toString(arr));

	}
}
