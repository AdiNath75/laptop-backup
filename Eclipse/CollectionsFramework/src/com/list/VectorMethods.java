package com.list;

import java.util.Enumeration;
import java.util.Vector;

public class VectorMethods {
	public static void main(String[] args) {
		Vector<Integer> v1 = new Vector<>();
		v1.add(2);
		v1.addElement(3);
		v1.add(0, 1);
		v1.add(5);
		v1.add(3, 2);
		v1.add(6);
		v1.add(2);
		v1.insertElementAt(4, 3);
		System.out.println(v1);
		System.out.println(v1.firstElement());
		System.out.println(v1);
		System.out.println(v1.lastElement());
		System.out.println(v1.subList(2, 6));
		System.out.println(v1.capacity());
		System.out.println(v1.lastIndexOf(2));
		System.out.println(v1.lastIndexOf(v1, 2));
		
		Enumeration<Integer> enu = v1.elements();
		  
        System.out.println("The enumeration of values are:");
  
        // Displaying the Enumeration
        while (enu.hasMoreElements()) {
            System.out.print(enu.nextElement()+" ");
        }
        System.out.println();
	}

}
