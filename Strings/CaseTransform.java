
public class CaseTransform {
	public static void main(String[] args) {
		String s = "PANKAJ";
		convertToLowerCase(s);
	}

	private static void convertToLowerCase(String st) {
		char str[] = st.toCharArray();
		int i = 0;
		for (i = 0; i < str.length; i++) {
			if (str[i] >= 'A' && str[i] <= 'Z') {
				str[i] = (char) ((int) str[i] + 32);
			}
		}
		System.out.println("The string in LowerCase is");
		for (i = 0; i < str.length; i++)
			System.out.print(str[i]);
	}
}
