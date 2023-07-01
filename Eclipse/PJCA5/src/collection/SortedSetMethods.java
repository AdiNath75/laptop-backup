package collection;

import java.util.TreeSet;

public class SortedSetMethods {
	
	public static void main(String[] args) {
		
		TreeSet<Integer> t1 = new TreeSet<>();
		
		t1.add(741);
		t1.add(789);
		t1.add(568);
		t1.add(456);
		t1.add(653);
		t1.add(321);
		
		System.out.println(t1);
		
		System.out.println(t1.comparator());
		
		System.out.println(t1.first());
		
		System.out.println(t1.headSet(741));
		
		System.out.println(t1.last());
		
		System.out.println(t1.spliterator());
		
		System.out.println(t1.subSet(456, 789));
		
		System.out.println(t1.tailSet(568));	
		
	}
}
