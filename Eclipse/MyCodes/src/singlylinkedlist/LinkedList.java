package singlylinkedlist;

public class LinkedList {
	// Linked list implementation in Java
	  // Creating a node
	  Node head;

	  static class Node {
	    int value;
	    Node next;

	    Node(int d) {
	      value = d;
	      next = null;
	    }
	  }
	  public static void main(String[] args) {
	    LinkedList linkedList = new LinkedList();

	    // Assign value values
	    linkedList.head = new Node(1);
	    Node second = new Node(2);
	    Node third = new Node(3);
	    Node fourth = new Node(4);

	    // Connect nodes
	    linkedList.head.next = second;
	    second.next = third;
	    third.next = fourth;

	    // printing node-value
	    while (linkedList.head != null) {
	      System.out.print(linkedList.head.value + " ");
	      linkedList.head = linkedList.head.next;
	    }
	  }
	}
