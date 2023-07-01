package exception;

import java.util.Scanner;
public class Exception1 {
	
	public static void main(String[] args) {
		
		System.out.println("Main Begin");
		
		try (Scanner sc = new Scanner(System.in)) {
			int n1 = 0, n2 = 0;
			try
			{
				System.out.println("Enter first Number");
				n1 = sc.nextInt();
				
				System.out.println("Enter Second Number");
				n2 = sc.nextInt();
			}
			catch(RuntimeException e1)
			{
				System.out.println("Enter valid Number");
			}
			
			try
			{
				int res = n1/n2;
				System.out.println(res);
			}
			catch(Exception e2)
			{
				System.out.println("Please do not divide Number by Zero");
			}
		}
		
		System.out.println("Main End");
		
	}

}
