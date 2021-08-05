import java.util.ArrayList;
import java.util.List;

public class Program17 {
	public static void main(String[] args) {
		String s = "abfghklj";
		String s2 = "acdefghijklj";

		if (s.length() > s2.length())
			System.out.println(findCommonSubstring(s2, s));
		else
			System.out.println(findCommonSubstring(s, s2));
	}

	private static List<String> findCommonSubstring(String s, String s2) {
		char[] s2chArr = s2.toCharArray();
		char[] schArr = s.toCharArray();
		
		String output="";
		List<String> list = new ArrayList<String>();
		
		for(int i=0;i<schArr.length;i++){
			for(int j=0;j<s2chArr.length;j++){
				if(schArr[i] == s2chArr[j]){
					output = output + schArr[i];
					i++;
				}else{
					list.add(output);
					output ="";
				}
			}
			
			
		}
		
		return list;
	}
}
