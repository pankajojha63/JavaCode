package com.arrays;

import java.util.Arrays;

public class TargetSum {
	public static void main(String[] args) {
		int[] arr = { 2,8, 7, 11, 15 };
		int target = 15;
		System.out.println(Arrays.toString(twoSum(arr, target)));
	}

	public static int[] twoSum(int[] nums, int target) {
        int pointer_A = 0;
		int pointer_B = nums.length - 1;
		int[] newArr = new int[2];
		int sum = 0;
		while (pointer_A < pointer_B) {
			sum = nums[pointer_A] + nums[pointer_B];
			if (sum == target) {
				newArr[0] = pointer_A;
				newArr[1] = pointer_B;
				return newArr;
			} else {
				pointer_B--;
				if(pointer_B ==pointer_A){
					pointer_A ++;
					pointer_B = nums.length - 1;
				}
			}
		}

		return null;
    }
}
