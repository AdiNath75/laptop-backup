package leetcodes;
import java.util.*;
import java.io.*;
public class HashMapH {
	//Complete this code or write your own from scratch
		public static void main(String []argh)
		{
			Scanner in = new Scanner(System.in);
			Hashtable<String, Integer> h1 = new Hashtable<>();
			int n=in.nextInt();
			in.nextLine();
			for(int i=0;i<n;i++)
			{
				String name=in.nextLine();
				int phone=in.nextInt();
				h1.put(name, phone);
				in.nextLine();
			}
			while(in.hasNext())
			{
				String s=in.nextLine();
				if(h1.containsKey(s)) {
					System.out.println(s+"="+h1.get(s));
				}
				else {
					System.out.println("Not Found");
				}
			}
	}
}
