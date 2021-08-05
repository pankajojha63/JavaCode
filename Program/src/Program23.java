import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program23 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		List<Integer> evenlist  = list.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(evenlist);
	}
}
