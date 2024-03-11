package number;
import java.util.Scanner;

public class Divisor {
	
		public static void main(String[] args) 
		{
			Scanner s = new Scanner(System.in);
			System.out.println("Enter Any Number");
			int num = s.nextInt();
			int count = 0;
			for (int i=1;i<=num/2;i++ )
			{
				if (num%i==0)
				{
					count++;
				}
			}
			System.out.println("The Number "+num+" has "+count+" Divisors");
		}
	
}
