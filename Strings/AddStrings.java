package com.strings;

public class AddStrings {
	public static void main(String[] args) {
		String num1 = "9";
		String num2 = "99";
		System.out.println(addStrings(num1, num2));
	}

	public static String addStrings(String num1, String num2) {
		StringBuilder result = new StringBuilder();
		int i = num1.length() - 1;
		int j = num2.length() - 1;
		int carry = 0;

		while (i >= 0 || j >= 0) {
			int sum = carry;
			if (i >= 0) {
				sum += num1.charAt(i--) - '0';
			}
			if (j >= 0) {
				sum += num2.charAt(j--) - '0';
			}
			if (num1.length() == 1 && num2.length() == 1) {
				result.append(sum);
				return result.toString();
			} else if( i == -1 && j ==-1){
				result.append(sum% 10);
				carry = sum ;
			}else {
				result.append(sum % 10);
				carry = sum / 10;
			}
		}

		return result.reverse().toString();

	}
}
