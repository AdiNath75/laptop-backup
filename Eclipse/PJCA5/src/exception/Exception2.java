package exception;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Exception2 {
	
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			
			try {
				System.out.println("Enter Numerator Value");
				int num1 = sc.nextInt();
				System.out.println("Enter the Denominator Value");
				int num2 = sc.nextInt();
				int ans = num1/num2;
				System.out.println(ans);
				
		
			}
			catch(ArithmeticException a1)
			{
				System.out.println("Dont divide value by Zero");
			}
			catch(NullPointerException n1)
			{
				System.out.println("Reference variable of exception is Null");
			}
			catch(InputMismatchException i1)
			{
				System.out.println("Enter valid Input");
			}	
		}
	}
}
