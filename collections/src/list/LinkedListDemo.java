package list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	public static void main(String[] args) {
		List<String> llist = new LinkedList<String>();
		llist.add("Pankaj");
		llist.add("Kankaj");
		llist.add("Dankaj");
		llist.add("Cankaj");
		System.out.println(llist);
		Collections.sort(llist);
		System.out.println(llist);
	}
}
