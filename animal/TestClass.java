package animal;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class TestClass {
	public static void main(String args[]) throws Exception {
		Scanner s = new Scanner(System.in);
		int testCase = s.nextInt();
		String name = s.next();

		char[] chArr = name.toCharArray();
		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		for (int i = 0; i < name.length(); i++) {
			if (hmap.containsKey(chArr[i])) {
				hmap.put(chArr[i], hmap.get(chArr[i]) + 1);
			} else {
				hmap.put(chArr[i], 1);
			}
		}

		int count = 0;
		Iterator itr = hmap.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry<Character, Integer> entry = (Map.Entry<Character, Integer>) itr.next();
			if (entry.getValue() > 1) {
				count = count + entry.getValue();
			}

		}
		System.out.println(count);
	}
}
