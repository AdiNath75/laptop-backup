package singlylinkedlist;

import java.util.LinkedList;

public class DeleteElement {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(25);
		list.add(10);
		list.add(15);
		list.add(25);
		System.out.println(list);
		list.pop(); //delete first
		System.out.println(list);
		list.removeLast();
		System.out.println(list);
		list.push(5);
		System.out.println(list);
		list.pollLast();
		System.out.println(list);
	}
	
}
