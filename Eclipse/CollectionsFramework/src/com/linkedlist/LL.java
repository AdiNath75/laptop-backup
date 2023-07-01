package com.linkedlist;

import java.util.LinkedList;

public class LL {
	
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		
		list.add("Asdfg");
		list.add("qwerwt");
		list.addFirst("first");
		list.addLast("last");
		list.add("second");
		System.out.println(list);		
		
	}

}
