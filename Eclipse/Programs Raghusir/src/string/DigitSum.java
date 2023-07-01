package string;
import java.util.Scanner;

public class DigitSum {
	
		public static void main(String[] args) 
		{
			try (Scanner s = new Scanner(System.in)) {
				System.out.println("Enter the String");
				String st = s.nextLine();
				int sum=0;
				for (int i=0;i<st.length() ;i++ )
				{
					char ch = st.charAt(i);
					if (ch>='0' && ch<='9')
					{
						sum=sum+ch-48;
					}
				}
				System.out.println("Sum of Digits in String is : "+sum);
			}
		}
	
}
