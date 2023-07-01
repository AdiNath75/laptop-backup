package numbers;
import java.util.Scanner;

public class NumToChar {
	
		public static void main(String[] args) 
		{
			Scanner s = new Scanner(System.in);
			System.out.println("Enter any Number");
			int num = s.nextInt();
			String st = "0ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			int i;
			for ( i=0;i<st.length() ;i++ )
			{
				char ch = st.charAt(i);
				if (num==i)
				{
					System.out.println(ch);
				}
			}
			char ch = (char)25;
			System.out.println(ch);
	}

}
