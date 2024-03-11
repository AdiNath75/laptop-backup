package number;
import java.util.Scanner;

public class SumOfEOD {
	
		public static void main(String[] args) 
		{
			try (Scanner s = new Scanner(System.in)) {
				System.out.println("Enter any Number");
				int n = s.nextInt();
				int even = 0;
				int odd = 0;
				do{ 
					int d = n%10;
						if (d%2==0)
						{
							even = even + d;
						}
						else
						{
							odd = odd + d;
						}
				   }while (n!=0);
				System.out.println(even);
				System.out.println(odd);
			}
		}

}
