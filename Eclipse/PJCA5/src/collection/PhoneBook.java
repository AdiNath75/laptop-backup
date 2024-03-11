package collection;

import java.util.ArrayList;
import java.util.Scanner;
public class PhoneBook {
	
	public static void main(String[] args) {
		
		ArrayList a1 = new ArrayList();
		
		a1.add(new Contacts("Guldu", "Pune", "guldu@gmail.com", 7894563210l));
		
		a1.add(new Contacts("Dinga", "Deccan", "dinga@gmail.com", 9876541235l));
		
		a1.add(new Contacts("Paro", "Mumbai", "paro@gmail.com", 8529631470l));
		
		System.out.println(a1);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name to be Searched");
		
		String ip = sc.next();
		
		int i;
		for(i=0;i<a1.size();i++)
		{
			Object o = a1.get(i);
			Contacts c = (Contacts)o;
			if(c.name.equals(ip))
			{
				System.out.println("Contact Found");
				System.out.println("1.Call");
				System.out.println("2.Massage");
				break;
			}
		}	
		if(i==a1.size())
		{
			System.out.println("Not Found");
		}
	}
}
