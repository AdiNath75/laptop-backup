package string;
import java.util.Scanner;

public class MonthValidON {
	
		public static void main(String[] args) 
		{
			Scanner s = new Scanner(System.in);
			System.out.println("enter the month number");
			int m = s.nextInt();
			if(m>0 && m<13)
			System.out.println("Month is Valid");
			else
			System.out.println("Month is Invalid");
			
		}
	
}
