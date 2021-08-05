package strings;

public class ReverseString {
	public static void main(String[] args) {
		String str = "Pankaj";
		int i=(str.length()-1);
		String revStr="";
		while(i>=0){
			revStr = revStr+str.charAt(i);
			i--;
		}
		System.out.println(revStr);
		
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		System.out.println(sb);
	}
}
