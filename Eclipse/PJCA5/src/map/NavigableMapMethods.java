package map;

import java.util.TreeMap;

public class NavigableMapMethods {
	
	public static void main(String[] args) {
		
		TreeMap<Integer, String> t1 = new TreeMap<>();
		
		t1.put(101, "Leela");
		t1.put(102, "Laila");
		t1.put(104, "Sheela");
		t1.put(105, "Raju");
		t1.put(106, "Ramu");
		
		System.out.println(t1);
		
		System.out.println(t1.ceilingEntry(102));
		
		System.out.println(t1.ceilingKey(104));
		
		System.out.println(t1.descendingKeySet());
		
		System.out.println(t1.descendingMap());
		
		System.out.println(t1.firstEntry());
		
		System.out.println(t1.floorEntry(105));
		
		System.out.println(t1.headMap(104));
		
		System.out.println(t1.higherEntry(105));
		
		System.out.println(t1.higherKey(102));
		
		System.out.println(t1.lastEntry());
		
		System.out.println(t1.lowerEntry(101));
		
		System.out.println(t1.navigableKeySet());
		
		System.out.println(t1.pollFirstEntry());
		
		System.out.println(t1.tailMap(104));
		
		System.out.println(t1.subMap(102, 104));
		
		System.out.println(t1.tailMap(105, false));
		
		
		
	}

}
