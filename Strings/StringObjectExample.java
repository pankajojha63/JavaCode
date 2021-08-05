package strings;

public class StringObjectExample {
	public static void main(String[] args) {
		String s = "Pankaj";
		String s1 = "Pankaj";
		
		System.out.println(s == s1); //true
		System.out.println(s.equals(s1));//true
		
		String s2 = new String("Pankaj");
		
		System.out.println(s == s2); //false
		System.out.println(s.equals(s2));//true
		
		s1=s2;
		
		System.out.println(s == s1); //false
		System.out.println(s.equals(s1));//true
		
	}
}
