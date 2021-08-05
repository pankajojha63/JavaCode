import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program27 {
	public static void main(String[] args) {
		//String s = "My Name is \"Pankaj kumar Ojha\" and My designation is \"Senior Software Engineer\"";
		String s = "My Name is \"Pankaj kumar Ojha\" and My designation is \"Senior Software Engineer\" and and \"asjag sdha\" and ";
		List<String> list = new ArrayList<String>();
		int index = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				list.add(s.substring(index, i));
				index = i;
			}
			if (s.charAt(i) == '"') {
				for (int j = i + 1; j < s.length(); j++) {
					if (s.charAt(j) == '"') {
						list.add(s.substring(i + 1, j));
						i = j + 1;
						index = j + 1;
						break;
					}
				}
			}
		}
		String[] sArr = new String[list.size()];
		for (int i = 0; i < list.size(); i++) {
			sArr[i] = list.get(i).trim();
		}

		System.out.println(Arrays.toString(sArr));
	}
}
