package test;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackExample {
	public static void main(String[] args) {
		String exp = "[{()}";
		System.out.println(isExpressionBalanced(exp));
	}

	private static boolean isExpressionBalanced(String exp) {

		Deque<Character> stack = new ArrayDeque<Character>();
		for (int i = 0; i < exp.length(); i++) {
			char check = exp.charAt(i);

			if (check == '(' || check == '{' || check == '[') {
				stack.push(check);
				continue;
			}
			if (stack.isEmpty())
				return false;

			char x;
			switch (check) {
			case ')':
				stack.pop();
				if (check == '{' || check == '[')
					return false;
				break;

			case '}':
				stack.pop();
				if (check == '(' || check == '[')
					return false;
				break;

			case ']':
				stack.pop();
				if (check == '{' || check == '(')
					return false;
				break;

			}

		}

		return stack.isEmpty();
	}
}
