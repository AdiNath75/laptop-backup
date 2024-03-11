package string;
import java.util.Scanner;

public class LetterCount {
	
	public static void main(String[] args) 
	{
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter the String");
			String st = s.nextLine();
			int uc=0, lc=0;
			for (int i=0;i<st.length() ;i++ )
			{
				char ch = st.charAt(i);
				if (ch>='A' && ch<='Z')
				{
					uc++;
				}
				else if (ch>='a' && ch<='z')
				{
					lc++;
				}
			}
			System.out.println(uc);
			System.out.println(lc);
		}	
	}
}
