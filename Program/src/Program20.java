import java.util.Stack;

public class Program20 {
	public static void main(String[] args) {
		String s = "(1+2*3)*4"; // 123*+4* //12*+3+4*
		Stack stack = new Stack();
		String result = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(' ) {
				stack.push('(');
			} else if (s.charAt(i) == '*') {
				stack.push('*');
			} else if (s.charAt(i) == '+') {
				stack.push('+');
			} else if(s.charAt(i) == ')'){
				stack.push(')');
			}
			else {
				result = result .concat(s.charAt(i)+"");
			}
		}
		System.out.println(stack);
	}
}
/*
1 + 2 * 3 + 4	--> 1 2 3 * + 4 +

(1+2*3)*4 => 1 2 3 * + 4 * => 28

(4+5)*(3*2+1) => 4 5 + 3 2 * 1 + * => 63

(2 * 3 + 1) * (5 + 6 * 4) + 7 =>  2 3 * 1 + 5 6 4 * + * 7 +
*/