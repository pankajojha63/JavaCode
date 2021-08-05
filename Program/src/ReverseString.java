import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseString {
	public static void main(String[] args) {
		final List<String> list = new ArrayList<String>();
		list.add("pankaj");
		/*list.stream().map(i -> {
			StringBuffer sb = new StringBuffer(i);
			return sb.reverse().toString();
		}).forEach(System.out::println);*/
		
		
		Collections.unmodifiableList(list);
		list.add("123");
		
		System.out.println(list);
	}

}
