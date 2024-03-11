package com.linkedlist;

public class Demo {
	Node head;

	class Node {
		String data;
		Node next;

		Node(String data) {
			this.data = data;
			this.next = null;
		}
	}

	// add - first
	public void addFirst(String data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}

	// add last
	public void addLast(String data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}

		Node currNode = head;
		while (currNode.next != null) {
			currNode = currNode.next;
		}
		currNode.next = newNode;
	}

	// print
	public void printList() {

		if (head == null) {
			System.out.println("list is empty");
			return;
		}
		Node currNode = head;
		while (currNode != null) {
			System.out.print(currNode.data + " -> ");
			currNode = currNode.next;
		}
		System.out.println("NULL");
	}

	// delete first
	public void deleteFirst() {
		if (head == null) {
			System.out.println("list is empty");
			return;
		}
		head = head.next;

	}

	// delete last
	public void deleteLast() {
		if (head == null) {
			System.out.println("list is empty");
			return;
		}

		if (head.next == null) {
			head = null;
			return;
		}

		Node secondLast = head.next;
		Node lastNode = head.next;
		while (lastNode.next != null) {
			lastNode = lastNode.next;
			secondLast = secondLast.next;
		}
		secondLast.next = null;
	}

	public void reverseIterate() {
		if (head == null || head.next == null) {
			return;
		}

		Node prevNode = head;
		Node currNode = head.next;
		while (currNode != null) {
			Node nextNode = currNode.next;
			currNode.next = prevNode;

			// update
			prevNode = currNode;
			currNode = nextNode;
		}
		head.next = null;
		head = prevNode;
	}

	public Node reverseRecursive(Node head) {
		if (head == null || head.next == null) {
			return head;
		}
		Node newHead = reverseRecursive(head.next);
		head.next.next = head;
		head.next = null;

		return newHead;

	}

	public static void main(String[] args) {
		Demo list = new Demo();
		list.addFirst("a");
		list.addFirst("is");
		list.addLast("list");
		list.printList();
		list.addFirst("this");
		list.printList();
		list.reverseIterate();
		list.printList();
		list.head = list.reverseRecursive(list.head);
		list.printList();

	}

}
