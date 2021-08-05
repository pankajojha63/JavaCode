package test;

import java.util.Arrays;

public class Program1 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,1};
		int n=1;
		Arrays.sort(arr);
		int count =0;
		for(int i=0;i<arr.length;i++){
			if(n == arr[i]){
				count += 1;
			}
		}
		System.out.println(count);
	}
}
//0(n)
//0(1)