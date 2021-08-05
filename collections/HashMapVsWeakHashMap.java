package collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class HashMapVsWeakHashMap {
	public static void main(String[] args) {
		Map<MapDemo, String> hmap = new HashMap<MapDemo, String>();
		Map<MapDemo, String> whmap = new WeakHashMap<MapDemo, String>();

		MapDemo d1 = new MapDemo();
		MapDemo d2 = new MapDemo();

		hmap.put(d1, "123");
		whmap.put(d2, "123");

		d1 = null;
		d2 = null;

		System.gc();

		System.out.println(hmap);
		System.out.println(whmap);

	}
}

class MapDemo {
	public String toString(){
		return "demo";
	}
	public void finalize() {
		System.out.println("Finlaize method called");
	}
}
