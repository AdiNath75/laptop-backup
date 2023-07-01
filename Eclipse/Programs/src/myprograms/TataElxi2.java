package myprograms;

import java.util.Scanner;
public class TataElxi2 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String str = "asdfghjhgfdsa";
			removeDuplicate(str);
		}
	}
	public static String deleteStr(String str, int index )
	{
		String st = "";
		for(int i=0;i<str.length()-1;)
		{
			char ch = str.charAt(i);
			if(i<index)
			{
				ch = str.charAt(i);
			}
			else
			{
				ch = str.charAt(i+1);
			}
			return st;
		}
		return st;
	}
	public static void removeDuplicate(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			for(int j=i+1;j<str.length();j++)
			{
				char ch1 = str.charAt(j);
				if(ch==ch1)
				{
					str = deleteStr(str,j);
					j--;
				}
			}
		}
		System.out.println(str);
	}

}
