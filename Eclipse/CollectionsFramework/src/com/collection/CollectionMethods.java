package com.collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionMethods {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		list.add(123);
		list.add(456);
		list.add(789);
		list.add(147);
		list.add(258);
		System.out.println("Add element");
		System.out.println(list);
		
		System.out.println("Size of List: "+list.size());
		System.out.println("remove element at index 4");
		
		list.remove(4);
		
		System.out.println(list);
		
		List<Integer> l2 = new ArrayList<>();
		System.out.println("Add all to l2");
		
		l2.addAll(list);
		
		System.out.println(l2);
		System.out.println("Remove all l2");
		
		l2.removeAll(l2);
		
		System.out.println(l2);
		
		System.out.println("Clear list");
		
		list.clear();
		
		System.out.println(list);
	}
}
