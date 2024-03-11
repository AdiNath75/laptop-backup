package singlylinkedlist;

import java.util.LinkedList;

public class InsertAtBeg {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(25);
		list.add(10);
		list.add(15);
		list.add(25);
		System.out.println(list);
		list.addFirst(1);//insert at first
		System.out.println(list);
		list.add(5, 5); //insert at specific
		System.out.println(list);
		list.addLast(100); //insert at last
		System.out.println(list);
	}
	

}
