package map;

import java.util.Hashtable;

public class HashtableMethods {
	
	public static void main(String[] args) {
		
		Hashtable<Integer, String> h1 = new Hashtable<>();
		
		h1.put(101, "Leela");
		h1.put(102, "Laila");
		h1.put(104, "Sheela");
		h1.put(105, "Raju");
		h1.put(106, "Ramu");
		
		System.out.println(h1);
		
		System.out.println(h1.clone());
		
		System.out.println(h1.elements());
		
		System.out.println(h1.keys());
		
	}

}
