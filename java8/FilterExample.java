package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {
	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		
		List<Integer> l2 = l1.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(l2);
	}
}
