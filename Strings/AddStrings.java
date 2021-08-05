
public class AddStrings {
	public static void main(String[] args) {
		String s1 = "6913259244";
		String s2 = "71103343";

		AddStrings add = new AddStrings();
		System.out.println(add.addStrings(s1, s2));
	}

	public String addStrings(String num1, String num2) {
		return Integer.parseInt(num1) + Integer.parseInt(num2)+"";

	}
}
