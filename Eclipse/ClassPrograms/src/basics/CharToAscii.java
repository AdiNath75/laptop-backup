package basics;
import java.util.Scanner;
public class CharToAscii {
	public static void ascii(char ch)
	{
		int val = ch; 
		System.out.println("The ASCII value of "+ch+" is "+val);
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any Character");
		char c1 = s.next().charAt(0);
		ascii(c1);
	}
}
