package number;
import java.util.Scanner;

public class Table {
	
		public static void table(int num)
		{
			for (int i=1;i<=10 ;i++ )
			{
				int table = num*i;
				System.out.println(num+"*"+i+"="+table);
			}
		}
		public static void main(String[] args) 
		{
			try (Scanner s = new Scanner(System.in)) {
				System.out.println("Enter any Number");
				int num = s.nextInt();
				table(num);
			}
		}
	
}
