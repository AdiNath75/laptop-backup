package collection;

import java.util.HashSet;

public class HashSet4 {
	
	public static void main(String[] args) {
		
		HashSet<Integer> h1 = new HashSet<>();
		
		h1.add(1);
		h1.add(123);
		h1.add(456);
		h1.add(54);
		
		System.out.println(h1);
		
		for(Integer i : h1)
		{
			System.out.println(i+10);
		}
	}

}
