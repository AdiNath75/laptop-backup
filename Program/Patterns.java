import java.util.Scanner;
class Patterns
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of n");
		int n = s.nextInt();
		for (int i=0; i<n; i++) 
            { 
				for (int j=n-1; j>i; j-- )
					System.out.print(" "); 
   
				for (int j=0; j<=i; j++ ) 
					System.out.print("* "); 

            System.out.println(); 
			}
	}
}