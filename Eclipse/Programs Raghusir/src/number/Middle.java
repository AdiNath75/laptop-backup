package number;
import java.util.Scanner;

public class Middle {
	
		public static void main(String[] args) 
		{
			Scanner s =new Scanner(System.in);
			System.out.println("Enter Three Integer Value");
			int a = s.nextInt();
			int b = s.nextInt();
			int c = s.nextInt();
			if (a>b && a<c)
				System.out.println(a+ " is the middle value");
			else if (b>a && b<c)
				System.out.println(b+" is the middle value");
			else 
				System.out.println(c+" is the middle value");
		}
	
}
