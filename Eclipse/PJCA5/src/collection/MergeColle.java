package collection;

import java.util.*;
public class MergeColle {
	
	public static void main(String[] args) {
		
		ArrayList a1 = new ArrayList();
		a1.add("Pune");
		a1.add("Mumbai");
		a1.add("Banglore");
		a1.add("Delhi");
		a1.add("Chennai");
		
		ArrayList a2 = new ArrayList<>();
		
		a2.add("India");
		a2.add("Japan");
		a2.add("Sri Lanka");
		a2.add("Russia");
		a2.add("New York");
		
		a2.addAll(a1);
		
		System.out.println(a2);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name to be Searched");
		
		String ip = sc.next();
		
		if(a2.contains(ip))
		{
			System.out.println("name found at index "+a2.indexOf(ip));
		}
		else
		{
			System.out.println("City Not Found");
		}
		
		
	}

}
