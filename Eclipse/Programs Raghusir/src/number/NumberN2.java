package number;
import java.util.Scanner;

public class NumberN2 {
	
		public static void main(String[] args) 
		{
			Scanner s = new Scanner(System.in);
			System.out.println("Enter valu of n");
			int n = s.nextInt();
			while (n>0)
			{
				System.out.println(n);
				--n;
			}
			System.out.println("Thank You");
		}
	
}
