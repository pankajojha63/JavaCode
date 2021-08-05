package strings;

public class RemoveCharDemo {
	public static void main(String[] args) {
		String s= "Pankaj";
		char c = 'a';
		
		System.out.println(removeChar(s,c));
	}

	private static String removeChar(String str, char c) {
		/*String modifiedStr="";
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==c){
				continue;
			}else{
				modifiedStr = modifiedStr + str.charAt(i);
			}
		}
		return modifiedStr ;*/
		
		return str.replaceAll(Character.toString(c), "");
	}
}
