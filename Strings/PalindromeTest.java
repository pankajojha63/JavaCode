package strings;

public class PalindromeTest {
	public static void main(String[] args) {
		String s="PankajOjap";
		String s2= "madam";
		
		System.out.println(s + " :: "+ isPalindrome(s.toLowerCase()));
		System.out.println(s2 + " :: "+isPalindrome(s2.toLowerCase()));
	}

	/*private static boolean isPalindrome(String str) {
		boolean isPalindromFlg = false;
		StringBuffer sb = new StringBuffer(str);
		sb = sb.reverse();
		if(str.equalsIgnoreCase(sb.toString())){
			isPalindromFlg = true;
		}
		return isPalindromFlg;
	}*/
	
	private static boolean isPalindrome(String str){
		boolean isPalindromFlg = false;
		int len = str.length();
		int middle  = len/2;
		for(int i=0;i<middle;i++){
			if(str.charAt(i) != str.charAt(len-1)){
				return false;
			}else{
				isPalindromFlg = true;
				len--;
			}
		}
		return isPalindromFlg;
	}
	
}
