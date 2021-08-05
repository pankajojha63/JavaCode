import java.util.Arrays;

//Silent - listen
/*
 * 
 * 
 */
public class Program22 {
	public static void main(String[] args) {
		String s1 = "silent";
		String s2 = "lssten";

		System.out.println(isAnagram(s1, s2));
	}

	private static boolean isAnagram(String s1, String s2) {
		boolean isAnagram = true;
		if (s1.length() != s2.length())
			return false;
		else {
			char[] chArr1 = s1.toCharArray();
			char[] chArr2 = s2.toCharArray();

			Arrays.sort(chArr1);
			Arrays.sort(chArr2);
			
			for(int i=0;i<s1.length();i++){
				if(chArr1[i]!=chArr2[i])
					isAnagram = false;
			}
			
			return isAnagram;
		}

	}
}
