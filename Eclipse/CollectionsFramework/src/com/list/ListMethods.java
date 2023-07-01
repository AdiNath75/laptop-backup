package com.list;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {
	public static void main(String[] args) {
		
		List<Integer> l1 = new ArrayList<>();
		
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		l1.add(7);
		System.out.println(l1);
		
		System.out.println("Accessed element at 2 ");
		int ele = l1.get(2);
		System.out.println(ele);
		System.out.println("Change element at index 5 from 7 to 6");
		l1.set(5, 6);
		System.out.println(l1);
		System.out.println("Removed element at 5 ");
		l1.remove(5);
		System.out.println(l1);
		
		Object[] arr = l1.toArray();
		System.out.println("To array");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	
		
	}

}
