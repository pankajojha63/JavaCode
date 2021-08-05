package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {
	public static void main(String[] args) {
		Map<String, Integer> hmap = new HashMap<String, Integer>();
		hmap.put("Pankaj",1);
		hmap.put("Dankaj",2);
		hmap.put("Fankaj",3);
		hmap.put("Cankaj",4);
		
		System.out.println(hmap);
		Iterator itr = hmap.entrySet().iterator();
		while (itr.hasNext()){
			Map.Entry<String, Integer> entry= (Map.Entry<String, Integer>)itr.next();
			System.out.println(entry.getKey() + " :: " + entry.getValue());
		}
	}
}
