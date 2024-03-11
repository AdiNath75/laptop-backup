package number;
import java.util.Scanner;

public class MaxOf2 {
	
		public static void main(String args[]) 
		{
			Scanner s = new Scanner(System.in);
			System.out.println("Enter Two Integer value");
			int a = s.nextInt();
			int b = s.nextInt();
			int c = a;
			if (b>c)
				c = b;
			System.out.println("Entered value is:" +c);
		}
	}

