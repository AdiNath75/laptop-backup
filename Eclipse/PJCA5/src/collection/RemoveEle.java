package collection;

import java.util.ArrayList;

public class RemoveEle {
	public static void main(String[] args) {
		
		ArrayList a1 = new ArrayList<>();
		
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(5);
		
		System.out.println(a1);
		
		a1.remove((Integer)2);
		System.out.println(a1);
		a1.remove(Integer.valueOf(1));
		System.out.println(a1);
	}

}
