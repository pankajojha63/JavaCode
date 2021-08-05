package arrays;

import java.util.Arrays;

public class MultiplyArray {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 0 };
		int[] newArr = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			newArr[i] = multiplyArrayIndex(arr, i);
		}
		System.out.println(Arrays.toString(newArr));
	}

	private static int multiplyArrayIndex(int[] arr, int index) {
		int multiply = 1;
		for (int i = 0; i < arr.length; i++) {
			if (index != i)
				multiply = multiply * arr[i];
		}
		return multiply;
	}
}
