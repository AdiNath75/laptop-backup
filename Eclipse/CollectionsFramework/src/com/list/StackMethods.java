package com.list;

import java.util.Stack;

public class StackMethods {
	public static void main(String[] args) {
		
		Stack<Integer> st = new Stack<>();
		st.add(0);
		st.push(1);
		st.push(2);
		st.add(3);
		st.push(4);
		st.push(5);
		st.add(6);
		st.push(7);
		
		System.out.println(st);
		System.out.println(st.pop());
		System.out.println(st);
		System.out.println(st.peek());
		System.out.println(st);
		System.out.println(st.search(3));
		System.out.println(st.empty());
	}

}
