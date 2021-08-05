import java.util.Arrays;

public class TestImpl {
	public static void main(String[] args) {
		int[] crayons = { 1, 4, 7 };
		Arrays.sort(crayons);
		int n = 36;

		int minNoOfPacktsRequrd = 0;
		int length = crayons.length;
		for (int i = length - 1; i >= 0; i--) {
			if (n >= crayons[i]) {
				minNoOfPacktsRequrd = minNoOfPacktsRequrd + (n / crayons[i]);
				n = n % crayons[i];

			}
		}
		System.out.println(minNoOfPacktsRequrd);
	}
}
