package com.list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMethods {
	public static void main(String[] args) {
		LinkedList<Integer> l1 = new LinkedList<>();
		l1.addFirst(1);
		l1.add(2);
		l1.add(2, 3);
		l1.add(4);
		l1.add(5);
		l1.offer(6);
		l1.add(7);
		l1.addLast(8);
		System.out.println(l1);
		System.out.println(l1.getFirst());
		System.out.println(l1.getLast());
		Iterator<Integer> it = l1.descendingIterator();

	    while (it.hasNext()) {
	    	System.out.print(it.next() + " ");
	    }
	    System.out.println();
	    l1.offerFirst(2);
	    System.out.println(l1);
	    l1.offerLast(8);
	    System.out.println(l1);
	    l1.removeFirst();
	    System.out.println(l1);
	    l1.removeLast();
	    System.out.println(l1);
	    l1.removeFirstOccurrence(l1);
	    System.out.println(l1);
	    System.out.println(l1.peek());
	    System.out.println(l1.peekFirst());
	    System.out.println(l1.peekLast());
	    System.out.println(l1.poll());
	    System.out.println(l1);
	    System.out.println(l1.pollFirst());
	    System.out.println(l1);
	    System.out.println(l1.pollLast());
	    System.out.println(l1);
	    
	    System.out.println(l1.pop());
	    System.out.println(l1);
	   l1.push(9);
	   System.out.println(l1);
	   
	   System.out.println(l1.element());
	   }

}
