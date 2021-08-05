package java8;

import java.util.ArrayList;
import java.util.List;

public class StreamMinAndMaxExample {
	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(10);
		l1.add(0);
		l1.add(20);
		l1.add(5);
		l1.add(8);
		
		System.out.println(l1);
		System.out.println("In Case of Ascending Order ");
		Integer min= l1.stream().min((o1,o2)->o1.compareTo(o2)).get();
		System.out.println("Min value :: "+min);
		Integer max= l1.stream().max((o1,o2)->o1.compareTo(o2)).get();
		System.out.println("Max value :: "+max);
		
		System.out.println("In Case of Descending Order ");
		min= l1.stream().min((o1,o2)->-o1.compareTo(o2)).get();
		System.out.println("Min value :: "+min);
		max= l1.stream().max((o1,o2)->-o1.compareTo(o2)).get();
		System.out.println("Max value :: "+max);
	}
}
