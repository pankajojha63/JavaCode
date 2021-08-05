import java.util.HashMap;
import java.util.Map;

public class HashMapIteration {
	public static void main(String[] args) {
		Map<String, Integer> hmap = new HashMap<String, Integer>();
		hmap.put("A", 1);
		hmap.put("B", 2);
		hmap.put("D", 3);
		hmap.put("C", 4);

		// hmap.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		// hmap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

		HashMap<Key, String> map = new HashMap<>();
		map.put(new Key(), "value1");
		map.put(new Key(), "value2");
		System.out.println(map.get(new Key()));
	}
}

class Key {
	public int hashcode() {
		return 1;
	}
}
