import java.util.ArrayList;
import java.util.List;

//list l1=[1,9,6,5,7,7,8,9,6]; // 1,5,8
public class Program16 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(9);
		list.add(6);
		list.add(5);
		list.add(7);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(6);

		list.stream().distinct().forEach(System.out::println);
	}
}
