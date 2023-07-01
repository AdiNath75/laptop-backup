package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet3 {
	
	public static void main(String[] args) {
		
		HashSet<Integer> h1 = new HashSet<>();
		
		h1.add(1);
		h1.add(123);
		h1.add(456);
		
		System.out.println(h1);
		
		Iterator<Integer> i1 = h1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}

}
