package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class HashMapValueSort {
	public static void main(String[] args) {
		Map<String, Integer> hmap = new HashMap<String, Integer>();
		hmap.put("A", 7000);
		hmap.put("B", 1000);
		hmap.put("C", 1000);
		hmap.put("D", 6000);
		hmap.put(null, 9000);

		// Sort hashmap based on Value
		Set<Integer> tset = new TreeSet<Integer>();
		for (Map.Entry<String, Integer> itr : hmap.entrySet()) {
			tset.add(itr.getValue());
		}

		Map<String, Integer> sortedhmap = new LinkedHashMap<String, Integer>();
		Iterator<Integer> setItr = tset.iterator();
		while (setItr.hasNext()) {
			int value = setItr.next();
			for (Map.Entry<String, Integer> itr : hmap.entrySet()) {
				if (itr.getValue() == value) {
					sortedhmap.put(itr.getKey(), itr.getValue());
				}
			}
		}
		System.out.println(hmap);
		System.out.println(sortedhmap);
	}
}
