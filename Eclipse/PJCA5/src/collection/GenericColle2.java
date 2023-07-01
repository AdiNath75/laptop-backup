package collection;

import java.util.ArrayList;
import java.util.Collections;

public class GenericColle2 {
	
	public static void main(String[] args) {
		
		ArrayList<String> a1 = new ArrayList<>();
		a1.add("India");
		a1.add("China");
		a1.add("Japan");
		a1.add("Sri Lanka");
		a1.add("Russia");
		
		System.out.println(a1);
		Collections.sort(a1);
		System.out.println(a1);
		
		Collections.reverse(a1);
		System.out.println(a1);
		
		Collections.shuffle(a1);
		System.out.println(a1);
	}

}
