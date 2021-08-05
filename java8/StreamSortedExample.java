package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortedExample {
	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(100);
		l1.add(66);
		l1.add(97);
		l1.add(33);
		l1.add(18);
		l1.add(80);
		
		System.out.println("Unsorted List :: " + l1);
		List l2 = l1.stream().sorted().collect(Collectors.toList()); //Default Sorting ->Ascending
		System.out.println("sorted List :: " + l2);
		
		List l3 = l1.stream().sorted((o1, o2)->(o1<o2?1:(o1>o2?-1:0))).collect(Collectors.toList()); // Sorting ->Decending
		System.out.println("sorted List in Descendig order:: " + l3);
		
		List l4 = l1.stream().sorted((o1,o2)->o2.compareTo(o1)).collect(Collectors.toList()); // Sorting ->Decending
		System.out.println("sorted List in Descendig order:: " + l4);
	}
}
