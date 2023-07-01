package myprograms;

import java.util.*;
public class OctToDec {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int num = sc.nextInt();
			int ans =  octToDec(num);
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
	public static int octToDec(int num)
	{
		int dec = 0;
		int count = count(num);
		for(int i=0; i<count;i++)
		{
			int rem = num%10;
			dec = dec + rem*pow(8,i);
			num/=10;
		}
		return dec;
	}

}
