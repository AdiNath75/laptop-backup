package map;

import java.util.TreeMap;

public class SortedMapMethods {
	
	public static void main(String[] args) {
		
		TreeMap<Integer, String> t1 = new TreeMap<>();
		
		t1.put(101, "Leela");
		t1.put(102, "Laila");
		t1.put(104, "Sheela");
		t1.put(105, "Raju");
		t1.put(106, "Ramu");
		
		System.out.println(t1);
		
		System.out.println(t1.comparator());
		
		System.out.println(t1.firstKey());
		
		System.out.println(t1.headMap(105));
		
		System.out.println(t1.lastKey());
		
		System.out.println(t1.subMap(102, 105));
		
		System.out.println(t1.tailMap(102));
		
		
		
	}

}
