package myprograms;

import java.util.*;
public class BinToDec {
	
public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int num = sc.nextInt();
			int ans = binToDec(num);
			System.out.println(ans);
		}
	}
		public static int count(int num)
		{
			int count = 0;
			for (int i=num;i>0;i/=10)
			{
				count++;
			}
			return count;
		}
		public static int pow(int n,int p)
		{
			int pow = 1;
			for(int i=p;i>0;i--)
			{
				pow = pow*n;
			}
			return pow;
		}
		public static int binToDec(int num)
		{
		int count = count(num);
		int oct = 0;
		for(int i=0;i<count;i++)
		{
			int rem = num%10;
			oct = oct+(rem*pow(2,i));
			num/=10;
		}
		return oct;
	
		}

}
