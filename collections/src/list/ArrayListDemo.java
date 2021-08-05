package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		List<String> list  = new ArrayList<String>();
		list.add("Pankaj");
		list.add("Cankaj");
		list.add("Dankaj");
		list.add("Tankaj");
		list.add("Kankaj");
		list.add("Vankaj");
		System.out.println(list);
		System.out.println("----------Uisng Iterator-----");
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()){
			System.out.print(itr.next()+" ");
		}
		System.out.println("\n----------Uisng List Iterator for forward-----");
		ListIterator<String> itr2 = list.listIterator();
		while (itr2.hasNext()){
			System.out.print(itr2.next()+" ");
		}
		System.out.println("\n----------Uisng List Iterator for reverse-----");
		ListIterator<String> itr3 = list.listIterator(list.size());
		while (itr3.hasPrevious()){
			System.out.print(itr3.previous() +" ");
		}
		Collections.sort(list);
		System.out.println("\n----------Sorted List----");
		System.out.println(list);
	}
	
}
