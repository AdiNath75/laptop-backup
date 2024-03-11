package collection;

import java.util.ArrayList;

public class ArrayListMethods {
	
	public static void main(String[] args) {
		
		ArrayList a1 = new ArrayList<>();
		
		a1.add("Adi");
		a1.add(123);
		a1.add(true);
		a1.add('A');
		a1.add(4.56);
		
		System.out.println(a1);
		
		System.out.println(a1.clone());
		
		for (Object a : a1) {
			
			System.out.println(a);
		}
		
		
		a1.trimToSize();
		
		System.out.println(a1);
	}

}
