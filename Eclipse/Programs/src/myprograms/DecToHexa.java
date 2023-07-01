package myprograms;

import java.util.*;
public class DecToHexa {
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			int num = sc.nextInt();
			decToHexa(num);
			
		}
	}
	public static void decToHexa(int num)
	{
		
		int[] hex = new int[100];
		int i=0;
		while(num != 0) {
			hex[i] = num%16;
			num = num/16;
			i++;
		}
		for(int j=i-1;j>=0;j--)
		{
			if(hex[j]>9)
			{
				System.out.print((char)(55 + hex[j]));
			}
			else
			{
				System.out.print(hex[j]);
			}
		}
		
	}

}
