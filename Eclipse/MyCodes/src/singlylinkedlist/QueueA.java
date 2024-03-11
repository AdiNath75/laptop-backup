package singlylinkedlist;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueA {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		
		s.add(1);
		s.add(2);
		s.push(3);
		s.push(4);
		int a = s.peek();
		System.out.println(a);
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s);
		
		Queue<Integer> q1 = new LinkedList<>();
		q1.add(5);
		q1.add(6);
		q1.add(7);
		q1.add(8);
		System.out.println(q1);
		q1.remove();
		System.out.println(q1);
		q1.poll();
		System.out.println(q1.peek());
		System.out.println(q1);
	}
}
