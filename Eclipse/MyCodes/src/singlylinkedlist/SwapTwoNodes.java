package singlylinkedlist;

import java.util.LinkedList;

public class SwapTwoNodes {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.push(7);
        list.push(6);
        list.push(5);
        list.push(4);
        list.push(3);
        list.push(2);
        list.push(1);
		System.out.println(list);
		swap(list,5,2);
	}
	public static void swap(LinkedList<Integer> list, int a, int b) {
		int temp = 0;
		int temp1 = 0;
		for(int i=0;i<list.size();i++) {
			if(list.get(i) == a) {
				temp = i;
			}else if(list.get(i) == b) {
				temp1=i;
			}
		}
		System.out.println(temp+" "+temp1);
		list.set(temp, b);
		list.set(temp1, a);
		System.out.println(list);
	}

}
