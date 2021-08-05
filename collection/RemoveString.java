package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class RemoveString {
	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		al.add("Pankaj");
		al.add("Kumar");
		al.add("Ojha");

		System.out.println(al + "\n");

		Scanner myObj = new Scanner(System.in); // Create a Scanner object
		String removeStr = myObj.nextLine();

		removeStringFromList(al, removeStr);
	}

	public static List<String> removeStringFromList(List<String> list, String removeStr) {
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			if (itr.next().equalsIgnoreCase(removeStr))
				itr.remove();
		}
		return list;
	}

}
