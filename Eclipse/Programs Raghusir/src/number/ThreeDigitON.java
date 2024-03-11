package number;
import java.util.Scanner;

public class ThreeDigitON {
	
		public static void main(String[] args) 
		{
			try (Scanner s = new Scanner(System.in)) {
				System.out.println("enter the integer number");
				int num = s.nextInt();
				if((num>9 && num<1000) || (num<-9 && num>-1000))
				System.out.println(num+" is Three Digit number");
				else
				System.out.println(num+" is Not Three Digit Number");
			}
			
		}
	
}
