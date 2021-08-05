package collection;

import java.util.Stack;

public class ReverseStackDemo {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		
		System.out.println(s);
		for(int i=0;i<s.size();i++){
			s.add(i, s.pop());
		}
		System.out.println(s);
	}
}
