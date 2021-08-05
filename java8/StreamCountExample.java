package java8;

import java.util.ArrayList;
import java.util.List;

public class StreamCountExample {
	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(100);
		l1.add(80);
		l1.add(66);
		l1.add(97);
		l1.add(33);
		l1.add(18);
		
		int noOfFailedStud = (int) l1.stream().filter(i->i<35).count();
		System.out.println(noOfFailedStud);
	}
}
