package number;
import java.util.Scanner;

public class NumberN1 {
	
		public static void main(String[] args) 
		{
			Scanner s = new Scanner(System.in);
			System.out.println("Enter value of n");
			int n = s.nextInt();
			int i=1;
			while (i<=n)
			{
				System.out.println(i);
				i++;
			}
			System.out.println("Thank You");
		}
	
}
