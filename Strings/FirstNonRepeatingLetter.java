import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeatingLetter {
	public static String firstNonRepeatingLetter(String str) {
		Map<Character, Integer> counts = new LinkedHashMap<Character, Integer>();

		if (str.length() == 1)
			return str;

		for (char c : str.toCharArray()) {
			counts.put(c, counts.containsKey(c) ? counts.get(c) + 1 : 1);
		}

		for (Entry<Character, Integer> entry : counts.entrySet()) {
			if (entry.getValue() == 1) {
				return entry.getKey()+"";
			}
		}
		return "";
	}

	public static void main(String[] args) {
		String s = "sTreSS";
		System.out.println(firstNonRepeatingLetter(s));
	}
}
