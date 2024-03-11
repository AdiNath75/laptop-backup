package collection;

import java.util.ArrayList;

public class CollectionMethod {
	
	public static void main(String[] args) {
		
		ArrayList a1  = new ArrayList();
		a1.add("Adi");
		a1.add(123);
		a1.add(true);
		a1.add('A');
		a1.add(4.56);
		
		System.out.println(a1);
		
		ArrayList a2  = new ArrayList();
		a2.add("Adi");
		a2.add(123);
		a2.add(true);
		a2.add('A');
		a2.add(4.56);
		
		System.out.println(a2);
		
		System.out.println(a1.contains(123));
		
		System.out.println(a1.equals(a2));
		
		System.out.println(a1.hashCode());
		
		System.out.println(a2.isEmpty());
		
		System.out.println(a1.iterator());
		
		System.out.println(a2.remove(4.56));
		
		System.out.println(a2);
		
		System.out.println(a1.size());
		
		System.out.println(a1.spliterator());
		
		System.out.println(a1.stream());
		
		ArrayList a3  = new ArrayList();
		a3.add(789);
		a3.add(123);
		a3.add(456);
		a3.add(147);
		a3.add(963);
		
		System.out.println(a3.toArray());
		System.out.println(a2);
		a1.clear();
		System.out.println(a1);
		
	}
}
