package myprograms;

import java.util.Scanner;
public class TataElxi {
	
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String str = sc.nextLine();
			int sum = 0;
			for(int i=0;i<str.length();i++)
			{
				char ch = str.charAt(i);
				int num = charToInt(ch);
				sum = sum+num;
			}
			System.out.println(sum);
		}
	}
	public static int charToInt(char ch)
	{
		int arr[] = new int[26];
		int j=0,k=1;
		arr[j]=0;
		arr[k]=1;
		for (int i=2;i<arr.length;i++)
		{
			arr[i]= arr[j]+arr[k];
			j++;
			k++;
		}
		int num = ch-65;
		for (int i=0;i<arr.length;i++)
		{
			if (num==i)
			{
				return arr[i];
			}
		}
		return 0;
	}

}
