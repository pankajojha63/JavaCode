import java.util.Arrays;

public class Program1 {
	public static void main(String[] args) {
		int[] arr = { 6, 2, 1, 5, -3, 11, 3 };
		int target = 8;
		int[] pair = new int[2];
		for (int i = 0; i < arr.length; i++) {
			pair = findPair(arr, i, i + 1, target);
			if (null != pair) {
				System.out.println((Arrays.toString(pair)));
			}
		}
		System.out.println(10 + 20 + "Test");
		System.out.println("Test" + 10 + 20);

	}

	private static int[] findPair(int[] arr, int j, int index, int target) {
		int[] pair = new int[2];
		for (int i = index; i < arr.length; i++) {
			if ((arr[j] + arr[i]) == target) {
				pair[0] = arr[j];
				pair[1] = arr[i];
				return pair;
			}
		}
		return null;
	}
}
