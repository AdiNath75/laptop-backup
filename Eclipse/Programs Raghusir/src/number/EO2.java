package number;
import java.util.Scanner;

public class EO2 {
	
		public static void main(String[] args) 
		{
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the number");
			int a = s.nextInt();
			if (a/2*2==a)
			System.out.println(a+ " :is the Even");
			else
			System.out.println(a+ " :is the Odd");

		}
	
}
