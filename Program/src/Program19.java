import java.util.ArrayList;
import java.util.List;

//1 2 3 * + 4 + //6+4+
public class Program19 {
	public static void main(String[] args) {
		String input = "123*+4*";
		//String input = "45+32*1+*";
		List<Integer> list = new ArrayList<Integer>();
		int value = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == '*') {
				value = list.get(list.size()-1) * list.get(list.size()-2);
				list.remove(list.size()-1);
				list.remove(list.size()-1);
				list.add(value);
			} else if (input.charAt(i) == '+') {
				value = list.get(list.size()-1) + list.get(list.size()-2);
				list.remove(list.size()-1);
				list.remove(list.size()-1);
				list.add(value);
			} else {
				list.add(Character.getNumericValue(input.charAt(i)));
			}
		}
		System.out.println(list);
	}
}
