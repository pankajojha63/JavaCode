import java.util.HashMap;
import java.util.Map;

public class LongestSubString {
	public static void main(String[] args) {
		String s = "GEEKSFORGEEKS";
		int len = s.length();
		System.out.println(findLongestSubstring(s, len));
	}

	private static String findLongestSubstring(String s, int len) {
		Map<Character, Integer> hmap = new HashMap<Character, Integer>();
		int start = 0;
		int currlen = 0;
		int maxlen = 0;
		int index = 0;
		int i;

		hmap.put(s.charAt(0), 0);
		for (i = 1; i < s.length(); i++) {
			if (!hmap.containsKey(s.charAt(i))) {
				hmap.put(s.charAt(i), i);
			} else {
				if (hmap.get(s.charAt(i)) >= index) {
					currlen = i - index;
					if (maxlen < currlen) {
						maxlen = currlen;
						start = index;
					}
					index = hmap.get(s.charAt(i)) + 1;
				}
				hmap.replace(s.charAt(i), i);
			}
		}

		if (maxlen < i - index) {
			maxlen = i - index;
			start = index;

		}
		return s.substring(start, start + maxlen);
	}
}
