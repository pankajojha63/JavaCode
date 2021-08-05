import java.util.Arrays;

public class Program3 {
	public static void main(String[] args) {
		int arr[] = { 10, 6, 8, 5, 9, 7, 4, 2 };
		
		int w = 3;
		int length = arr.length;
		int arrNew[] = new int[length-1];
		for (int i = 0; i < (length-w+1); i++) {
			arrNew[i] = findMinimunWindow(arr, i, w);
		}
		System.out.println(Arrays.toString(arrNew));
	}

	public static int findMinimunWindow(int[] arr, int i, int w) {
		int min = arr[i];
		for (int j = i + 1; j < (i + w); j++) {
			if (min > arr[j])
				min = arr[j];
		}
		return min;
	}
}
