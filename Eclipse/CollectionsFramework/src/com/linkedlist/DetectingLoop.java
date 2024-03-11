package com.linkedlist;

public class DetectingLoop {
	
	public boolean hasCycle(ListNoder head) {
		   ListNoder slow = head;
		   ListNoder fast = head;
		  
		   while(fast != null && fast.next != null) {
		       slow = slow.next;
		       fast = fast.next.next;
		      
		       if(fast == slow) {
		           return true;
		       }
		   }
		  
		   return false;
		}
	class ListNoder{
		int val;
		ListNoder next;
		ListNoder(int x){
			val = x;
			next = null;
		}
	}

}
