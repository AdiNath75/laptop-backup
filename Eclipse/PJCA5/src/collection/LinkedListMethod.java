package collection;

import java.util.LinkedList;

public class LinkedListMethod {
	
	public static void main(String[] args) {
		
		LinkedList l1 = new LinkedList<>();
		
		l1.add("Adi");
		l1.add(123);
		l1.add(true);
		l1.add('A');
		l1.add(4.56);
		
		System.out.println(l1);
		
		System.out.println(l1.offer("Adi"));
		
		System.out.println(l1);
		
		System.out.println(l1.offerFirst(456));
		System.out.println(l1);
		System.out.println(l1.remove()+" 123");
		
		System.out.println(l1);
		
		System.out.println(l1.peek());
		
		System.out.println(l1.peekFirst());
		
		System.out.println(l1.peekLast());
		
		l1.poll();
		
		System.out.println(l1);
		
		l1.pollFirst();
		
		System.out.println(l1);
		
		l1.pollLast();
		
		System.out.println(l1);
		System.out.println(l1.size());
	}

}
