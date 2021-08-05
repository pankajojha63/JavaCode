package java8;

import java.util.ArrayList;
import java.util.List;

public class StreamMapExample {
	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		
		l1.stream().map(i->i*i).forEach(System.out::println);
	}
}
