package com.return1;

import java.util.Scanner;

public class AlternatePrime {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		int count=0;
		for (int i = n1; i <= n2; i++) {
			if(prime(i)) {
				count++;
				if(count%2!=0) {
					System.out.println(i);
				}	
			}
		}	
	}
	public static boolean prime(int num)
	{
		int i;
		for (i=2;i<num ;i++ )
		{
			if (num%i==0)
				break;
		}
		if (num==i)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
}
