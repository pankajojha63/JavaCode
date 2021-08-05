import java.util.HashSet;

public class prac5 {
	private String s;
	prac5(String s){
		this.s=s;
	}
	public static void main(String[] args) {
		HashSet<Object> hs = new HashSet<Object>();
		prac5 p1 = new prac5("111");
		prac5 p2 = new prac5("111");
		
		String s1 = new String("111");
		String s2 = new String("111");
		
		hs.add(p1);
		hs.add(p2);
		hs.add(s1);
		hs.add(s2);
		
		System.out.println(hs.size());
		
		
		
	}
}
