package assesment;
import java.util.Scanner;

public class Wipro1 {
	
		public static void main(String[] args) 
		{
			Scanner s = new Scanner(System.in);
			int num1 = s.nextInt();
			int num2 = s.nextInt();
			int num3 = s.nextInt();
			System.out.print(num1+ " ");
			for (int i=1;i<num3 ;i++ )
			{
				num1 = num1+num2;
			System.out.print(num1+" ");
			}
		}
	

}
