package collection;

import java.util.ArrayList;
import java.util.List;

public class FinalCollectionDemo {
	public static void main(String[] args) {
		List l1 = new ArrayList();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		
		final List l2 = new ArrayList(l1);
		l2.add(6);
		
		List l3 = new ArrayList(l1);
		//l2 =l3;
		
		System.out.println(l2);
		
	}
}
