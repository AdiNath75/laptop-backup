package array;
import java.util.Scanner;

public class ArrOfNames {
	
		public static void main(String[] args) 
		{
			try (Scanner s = new Scanner(System.in)) {
				System.out.println("Enter Count of Names");
				int n=s.nextInt();
				String name[]=new String[n];
				System.out.println("Enter " +n+" Names");
				s.nextLine();
				for (int i=0;i<n ;i++ )
				{
					name[i]=s.nextLine();
				}
				System.out.println("User Entered names in reverse Order");
				for (int i=name.length-1;i>=0 ;i-- )
				{
					System.out.println(name[i]);
				}
			}
			
		}
	
}
