package test;

import java.util.Arrays;

/*Greater Element on Right Side
Given an array of integers, replace every element with the next greatest element (greatest element on the right side) in the array. 
Since there is no element next to the last element, replace it with -1. 

For example, if the array is 
Input: {16, 17, 4, 3, 5, 2}

Output: {17, 5, 5, 5, 2, -1}
*/

public class GreatestArray {
	public static void main(String[] args) {
		int[] arr = { 16, 17, 4, 3, 5, 2,9,5,8,7 };

		for(int i =0;i<arr.length;i++){
			arr[i] = findMax(arr,i+1);
		}
		arr[arr.length - 1] = -1;
		System.out.println(Arrays.toString(arr));

	}

	private static int findMax(int[] arr,int index) {
		int first = 0;
		for (int j = index; j < arr.length; j++) {
			first = arr[index];
			if(first<arr[j]){
				first = arr[j];
				 arr[index]= first;
			}
		}
		return first;
	}
}

