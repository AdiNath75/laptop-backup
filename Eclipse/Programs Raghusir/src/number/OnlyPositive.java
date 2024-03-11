package number;
import java.util.Scanner;

public class OnlyPositive {
	
		public static void main(String args[]) 
		{
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the Integer value");
			int a = s.nextInt();
			if (a<0)
				a=a*-1;
			System.out.println("Entered value is:" +a);
		}
	
}
