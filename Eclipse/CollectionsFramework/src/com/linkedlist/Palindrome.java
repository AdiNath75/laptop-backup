package com.linkedlist;

public class Palindrome {
	

	public static ListNodes getMiddle(ListNodes head) {
		ListNodes fast = head;
		ListNodes slow = head;
		while (fast.next != null && fast.next.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow;
	}

	public static ListNodes reverse(ListNodes head) {
		ListNodes prev = null;
		ListNodes curr = head;

		while (curr != null) {
			ListNodes next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}

	public static boolean isPalindrome(ListNodes head) {
		if (head == null || head.next == null) {
			return true;
		}

		ListNodes firstHalfEnd = getMiddle(head);
		ListNodes secondHalfStart = reverse(firstHalfEnd.next);
		ListNodes firstHalfStart = head;

		while (secondHalfStart != null) {
			if (secondHalfStart.val != firstHalfStart.val) {
				return false;
			}
			secondHalfStart = secondHalfStart.next;
			firstHalfStart = firstHalfStart.next;
		}

		return true;
	}
	
	public static void main(String[] args)
	{
		ListNodes head = new ListNodes(1);
		head.next = new ListNodes(2);
		head.next.next = new ListNodes(3);
		head.next.next.next = new ListNodes(2);
		head.next.next.next.next = new ListNodes(1);

		boolean ans = isPalindrome(head);

		System.out.println(ans);
	}
	
}
	
	class ListNodes {
		int val = 5;
		ListNodes next;
		
		ListNodes(){}
		
		ListNodes(int val){
			this.val = val;
		}
		
		
		ListNodes(int val, ListNodes next) {
			this.val = val;
			this.next = next;
		}
	}


