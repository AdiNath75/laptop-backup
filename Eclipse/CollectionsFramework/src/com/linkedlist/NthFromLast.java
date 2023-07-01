package com.linkedlist;


public class NthFromLast {

	static void printList(ListNode head)
	{
		ListNode ptr = head;
		while (ptr != null) {
		System.out.print(ptr.data + " ");
		ptr = ptr.next;
		}
		System.out.println();
	}

	public static ListNode removeNthFromEnd(ListNode head, int n) {
		   if(head.next == null) {
		       return null;
		   }
		  
		  
		   int size = 0;
		   ListNode temp = head;
		   while(temp != null) {
		       temp = temp.next;
		       size++;
		   }
		  
		   //removing SIZEth node from last i.e. head
		   if(n == size) {
		       return head.next;
		   }
		  
		   //find previous node
		   int ptf = size - n; // position to find
		   ListNode prev = head; // previous node
		   int cp = 1; // current position
		  
		   while(cp != ptf) {
		       prev = prev.next;
		       cp++;
		   }
		  
		   prev.next = prev.next.next;
		   return head;

	}

	public static void main(String[] args)
	{
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		System.out.println("Linked List before Deletion:");
		printList(head);

		head = removeNthFromEnd(head, 4);

		System.out.println("Linked List after Deletion:");
		printList(head);
	}
	
}
	class ListNode {
		int data;
		ListNode next;
	
		ListNode(int value)
		{
			this.data = value;
			this.next = null;
		}
	}

		

