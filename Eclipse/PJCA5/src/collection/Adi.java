package collection;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.Scanner;

public class Adi {
	
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			HashSet<String> t1 = new HashSet<>();
			t1.add(sc.next());
			t1.add(sc.next());
			t1.add(sc.next());
			t1.add(sc.next());
			t1.add(sc.next());

			System.out.println(t1);
			ArrayList<String> t2 = new ArrayList<>();

			for(String s : t1)
			{
				String str = s;
				str = reverse(str);
				t2.add(str);
			}
			System.out.println(t2);
		}
	}

	private static String reverse(String str) {
		
		 char ch[]=str.toCharArray();  
		    String rev="";  
		    for(int i=ch.length-1;i>=0;i--){  
		        rev+=ch[i];  
		    }  
		    return rev; 
	}

}
