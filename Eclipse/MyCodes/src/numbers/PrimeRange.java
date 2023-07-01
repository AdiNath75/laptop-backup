package numbers;
import java.util.Scanner;

public class PrimeRange {
	
		public static void prime(int num, int range)
		{
			int i;
			for (i=2;i<num ;i++ )
			{
				if (num%i==0)
					break;
			}
			if (num==i)
			{
				System.out.print(i+" ");
			}
		}
		public static void main(String[] args) 
		{
			Scanner s = new Scanner(System.in);
			System.out.println("Enter count Number");
			int range = s.nextInt();
			for (int i=0;i<range; i++)
			{
				prime(i,range);
			}
		}
	
}
