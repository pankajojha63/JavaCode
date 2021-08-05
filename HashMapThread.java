package test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashMapThread {
	public static void main(String[] args) {
		Map<Integer, String> hmap = Collections.synchronizedMap(new HashMap<Integer, String>());
	}
}
