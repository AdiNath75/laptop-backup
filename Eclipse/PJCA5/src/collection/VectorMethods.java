package collection;

import java.util.Vector;

public class VectorMethods {
	
	public static void main(String[] args) {
		
		Vector v1 = new Vector();
		
		v1.add("Adi");
		v1.add(123);
		v1.add(true);
		v1.add('A');
		v1.add(4.56);
		v1.add(741);
		v1.add("Nath");
		v1.add(78);
		v1.add('z');
		v1.add(false);
		v1.add(12);
		v1.add("Puri");
		
		System.out.println(v1);
		
		System.out.println(v1.capacity());
		
		System.out.println(v1.clone());
		
		System.out.println(v1.firstElement());
		
		System.out.println(v1.lastElement());
		
		System.out.println(v1.subList(2, 7));
	}

}
