import java.util.Arrays;

public class Demo {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };

		int pointerA = 0;
		int pointerB = arr.length - 1;

		int middle = (arr.length) / 2;
		while (pointerA < middle) {
			int temp;
			temp = arr[pointerA];
			arr[pointerA] = arr[pointerB];
			arr[pointerB] = temp;
			pointerB--;
			pointerA++;

		}
		System.out.println(Arrays.toString(arr));
	}
}

/*
 * reverse Array
 * 
 * 
 */