import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class prac4 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList();
		list.add(1);
		list.add(5);
		list.add(3);
		Collections.sort(list);
		System.out.println(list);
		list.add(2);
		list.add(4);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		list.stream().filter(i -> i%2 == 0 ).forEach(System.out::println);
	}

	public static Iterator reverse(List list) {
		Collections.reverse(list);
		return list.iterator();
	}

}
