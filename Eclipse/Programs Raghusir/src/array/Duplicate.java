package array;
import java.util.Scanner;

public class Duplicate {
	
		public static void main(String[] args) 
		{
			try (Scanner s = new Scanner(System.in)) {
				System.out.println("Enter Size of an Array");
				int n=s.nextInt();
				int ar[]=new int [n];
				System.out.println("Enter" +n+" values");
				for (int i=0;i<n ;i++ )
				{
					ar[i]=s.nextInt();
				}
				int cr[]=new int[ar.length];
				for (int i=0;i<ar.length ;i++ )
				{
					cr[i]=ar[i];
					System.out.println(cr[i]);
				}
			}
			
		}
	
}
