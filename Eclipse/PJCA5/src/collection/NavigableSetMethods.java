package collection;

import java.util.TreeSet;

public class NavigableSetMethods {
	
	public static void main(String[] args) {
		
		TreeSet<Integer> t1 = new TreeSet<>();
		
		t1.add(741);
		t1.add(789);
		t1.add(568);
		t1.add(456);
		t1.add(653);
		t1.add(321);
		
		System.out.println(t1);
		
		System.out.println(t1.ceiling(568));
		
		System.out.println(t1.descendingIterator());
		
		System.out.println(t1.descendingSet());
		
		System.out.println(t1.floor(653));
		
		System.out.println(t1.higher(456));
		
		System.out.println(t1.iterator());
		
		System.out.println(t1.lower(653));
		
		System.out.println(t1.pollFirst());
		
		System.out.println(t1.pollLast());	
	}
}
