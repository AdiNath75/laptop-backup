package collection;

import java.util.ArrayList;

public class ListMethods {
	
	public static void main(String[] args) {
		
		ArrayList a1  = new ArrayList();
		a1.add("Adi");
		a1.add(123);
		a1.add(true);
		a1.add('A');
		a1.add(4.56);
		
		System.out.println(a1);
		
		a1.add(4, "Nath");
		System.out.println(a1);
		
		System.out.println(a1.get(0));
		
		System.out.println(a1.indexOf('A'));
		
		System.out.println(a1.lastIndexOf(123));
		
		System.out.println(a1.listIterator());
		
		a1.remove(4);
		
		System.out.println(a1);
		
		a1.set(0, 'P');
		
		System.out.println(a1);
	
	}

}
