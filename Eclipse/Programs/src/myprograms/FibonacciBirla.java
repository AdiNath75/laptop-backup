package myprograms;

import java.util.Scanner;
public class FibonacciBirla {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			for (int i=0;i<arr.length;i++)
			{
				arr[i] = sc.nextInt();
			}
			for(int i=0;i<arr.length;i++)
			{
				String ans = checkFibonacci(arr[i]);
				System.out.println(ans);
			}
		}
	}
	public static String checkFibonacci(int n)
	{
		int a = 0;
		int b = 1;
		if(n==a || n==b)
		{
			return "TRUE";
		}
		int c = a+b;
		while(c<=n)
		{
			if(c==n)
				return "TRUE";
			a = b;
			b = c;
			c = a+b;
		}
		return "FALSE";
		}
	}
