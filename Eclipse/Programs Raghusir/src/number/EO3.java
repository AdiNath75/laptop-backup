package number;
import java.util.Scanner;

public class EO3 {
	
		public static void main(String[] args) 
		{
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the number");
			int a = s.nextInt();
			String st[] = {"Even", "Odd"};

			System.out.println(a+ " :is a "+st[a%2]); 

		}
	

}
