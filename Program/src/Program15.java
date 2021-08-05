import java.util.LinkedHashMap;
import java.util.Map;

public class Program15 {
	public static void main(String[] args) {
		String s = "welcometojavaworld";
		char[] chArr = s.toCharArray();

		Map<Character, Integer> hmap = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < chArr.length; i++) {
			if (hmap.containsKey(chArr[i])) {
				hmap.put(chArr[i], hmap.get(chArr[i]) + 1);
			} else {
				hmap.put(chArr[i], 1);
			}
		}
		System.out.println(hmap);
	}
}
