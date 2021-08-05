package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamStringSortedExample {
	public static void main(String[] args) {
		List<String> slist = new ArrayList<String>();
		slist.add("AAA");
		slist.add("AAAAA");
		slist.add("AA");
		slist.add("A");
		slist.add("AAAA");
		slist.add("BBBB");
		
		System.out.println("unsorted String List :: "+slist);
		Comparator<String> s = (o1,o2)->{
			int l1 = o1.length();
			int l2 = o2.length();
			if(l1<l2) return -1;
			else if( l1>l2) return 1;
			else return o1.compareTo(o2);
		};
		List l2 = slist.stream().sorted(s).collect(Collectors.toList());
		System.out.println("Sorted String based on length :: "+l2);
	}
}
