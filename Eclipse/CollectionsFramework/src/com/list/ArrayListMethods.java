package com.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Spliterator;

public class ArrayListMethods {
	
	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<>();
		l1.add(8);
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		l1.add(7);
		System.out.println(l1);
		Collections.sort(l1);
		System.out.println(l1);
		
		l1.add(5, 6);
		
		System.out.println(l1);
		ArrayList<Integer> l2 = new ArrayList<>();
		l2.addAll(l1);
		System.out.println(l2);
		l2.addAll(7, l1);
		System.out.println(l2);
		System.out.println(l2.contains(7));
		System.out.println(l2.clone());
		
		System.out.println(l2.get(10));
		System.out.println(l2.indexOf(7));
		
		System.out.println(l2.lastIndexOf(6));
		l2.remove(13);
		
		System.out.println(l2);
		l2.set(12, 7);
		System.out.println(l2);
		System.out.println(l2.subList(6, 10));
		Object[] ar = l2.toArray();
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		System.out.println(l2.size());
		
		l2.add(15);
		System.out.println(l2);
		
		l2.clear();
		System.out.println(l2);
		System.out.println(l2.isEmpty());
		
		Iterator<Integer> it = l1.iterator();

	    // Displaying the values after iterating
	    // through the list
	    System.out.println("\nThe iterator values"
	                       + " of list are: ");
	    while (it.hasNext()) {
	        System.out.print(it.next() + " ");
	    }
		
	    
	    ListIterator<Integer> iter = l1.listIterator();

      // Printing the iterated value
	    System.out.println("\nUsing ListIterator:\n");
	    while (iter.hasNext()) {
	        System.out.println("Value is : "
	                           + iter.next());
	    }
    
		ListIterator<Integer> iterator = l1.listIterator(2);
		
		// Printing the iterated value
		System.out.println("\nUsing ListIterator"
		                   + " from Index 2:\n");
		while (iterator.hasNext()) {
		    System.out.println("Value is : "
		                       + iterator.next());
		}
		
		Spliterator<Integer> l3 = l2.spliterator();
		
		l3.forEachRemaining((n) -> System.out.println(n));
	}
}

