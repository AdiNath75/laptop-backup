package map;

import java.util.HashMap;

public class HashMapMethods {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> h1 = new HashMap<>();
		
		h1.put(101, "Leela");
		h1.put(102, "Laila");
		h1.put(104, "Sheela");
		h1.put(105, "Raju");
		h1.put(106, "Ramu");
		
		System.out.println(h1);
		
		System.out.println(h1.clone());
		
		HashMap<Integer, String> h2 = new HashMap<>();
		
		System.out.println(h1.containsKey(101));
		
		System.out.println(h1.containsValue("Raju"));
		
		System.out.println(h1.entrySet());
		
		System.out.println(h1.equals(h2));
		
		System.out.println(h1.get(101));
		
		System.out.println(h1.hashCode());
		
		System.out.println(h1.isEmpty());
		
		System.out.println(h1.keySet());
		
		System.out.println();
		
		System.out.println(h1.remove(106));
		
		System.out.println(h1);
		
		h1.replace(102, "Kannu");
		
		System.out.println(h1);
		
		System.out.println(h1.size());
		
		System.out.println(h1.values());
		
		h1.clear();
		
		System.out.println(h1);
		
	}

}
