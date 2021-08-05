package test;

import java.util.Arrays;

public class Prac2 {

	public static void main(String[] args) {
		int[] arr1 = { 1, 4, 7, 8, 10 };
		int[] arr2 = { 2, 3, 9 };

		int l1 = arr1.length;
		int l2 = arr2.length;

		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		int temp;
		for (int i = 0; i < l1; i++) {
			for (int j = 0; j < l2; j++) {
				if (arr1[i] <= arr2[j]) {
					temp = arr2[l2 - 1];
					arr2[l2 - 1] = arr1[i];
					arr1[i] = temp;
				}
			}

		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));

	}

}
