import java.util.Stack;

//Check wheather given string is Balanced braces/brackets or not
//input will be string
//Sample input : [()]{}{[()()]()}

//output will be boolean

public class Test1 {
	public static void main(String[] args) {
		String input = "[(){}{[()()]()}]}";

		Stack<Character> stack = new Stack<Character>();
		String open = "[{(";
		String close = ")}]";

		for (int i = 0; i < input.length(); i++) {
			if (open.contains(input.charAt(i) + "")) {
				stack.push(input.charAt(i));
			} else if (close.contains(input.charAt(i) + "")) {
				if(!stack.isEmpty())
					stack.pop();
			}
		}
		System.out.println(stack.size());

	}
}
